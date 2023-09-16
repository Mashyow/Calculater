package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        (new ConsoleService()).start();
    }

    //-----------------------------------------------------------
    public static class Product implements Comparable<Product> {
        private String productName;
        private double price;

        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public int compareTo(Product o) {
            double difPrices = this.price - o.price;
            if (difPrices != 0.0) return difPrices < 0 ? -1 : 1;
            return this.productName.compareTo(o.productName);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(productName, product.productName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(productName, price);
        }
    }

    //-----------------------------------------------------------
    public static class Human implements Buyer {

        private String firstName;
        private String lastName;
        private double money; // денежный счет человека
        private Set<Product> products; // купленные продукты

        public Human(String firstName, String lastName, double money) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.money = money;
            this.products = new HashSet<>();
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public Set<Product> getProducts() {
            return products;
        }

        public void setProducts(Set<Product> products) {
            this.products = products;
        }

        public void buyProduct(Product product, Shop shop) {
            // Метод принимает на вход 2 параметра - название покупаемого продукта
            // и магазин, в котором производится покупка

            // Должен использоваться метод sellProduct класса Shop

            // Должны быть обработы исключения,
            // которые могут возникнуть при вызове метода sellProduct
            try {
                shop.sellProduct(product, this);
                // В случае успешной покупки - продукт добавляется в Set products
                products.add(product);
                // и с денежнего счета человека вычитается стоимость продукта
                money -= product.price;
            } catch (SellProductException e) {
                // В случае неудачной покупки / исключения - в консоль должна выводиться
                // причина, по которой покупка не произошла - сообщение исключения
                System.out.println(e.getMessage());
            }
        }
    }

    //-----------------------------------------------------------
    public interface Buyer {
        void buyProduct(Product product, Shop shop);
    }

    public static class Shop {
        private String name;
        private double money; // денежный счет магазина
        private Map<Product, Integer> products; // продукты и их количество
        //  количество может быть 0 !

        public Shop(String name, double money) {
            this.name = name;
            this.money = money;
            this.products = new TreeMap<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public Map<Product, Integer> getProducts() {
            return products;
        }

        public void setProducts(Map<Product, Integer> products) {
            this.products = products;
        }

        public void sellProduct(Product product, Human human) throws SellProductException {
            // На вход принимает имя покупаемого продукта
            // и человека, который хочет приобрести этот продукт

            // Метод должен проверять наличие продукта
            // В случае если товар закончился, должно выбрасываться исключение
            // SellProductException с текстом -
            // "Продукта с именем {product_name} нет в наличии"

            if (!this.products.containsKey(product) || products.get(product) == 0)
                throw new SellProductException(
                        "Продукта с именем " + product.getProductName() + " нет в наличии"
                );

            // Метод должен проверять - достаточно ли средств у покупателя
            // В случае если средств недостаточно, должно выбрасываться исключение
            // SellProductException с текстом -
            // "Уважаемый {first_name lastName}, для покупки товара недостаточно средств
            if (product.getPrice() > human.getMoney()) throw new SellProductException(
                    "Уважаемый " + human.getFirstName() + " " + human.getLastName() +
                            ", для покупки товара недостаточно средств"
            );

            // В случае успешной покупки, должен вычисляться НДС и уменьшаться количество
            // продукта, а так же пополняться денежный счет с учетом НДС, после чего выводит на экран
            // "{first_name} + ", вы успешно совершили покупку! C уважением, " + {shop_name}
            products.put(product, products.get(product) - 1);
            money += product.getPrice() - product.getPrice() * calculateNds(product.getPrice());
            System.out.println(human.getFirstName() +
                    ", вы успешно совершили покупку! C уважением, " +
                    this.name);
        }

        private double calculateNds(double price) {
            // Метод принимает на вход изначальную цену продукта
            // Должен возвращать 13 % от стоимости продукта
            return price * 0.13;
        }

        public List<Product> printAndGetAllProductsWithCount() {
            // Должен выводить в консоль все имеющиеся товары и их количество
            // в порядке возрастания по их цене
            // Формат вывода: 1. Пылесос - 2 - 12000.00
            // Должен отдавать список товаров - необходимо для ConsoleService
            java.util.List<Main.Product> productList = new java.util.ArrayList<>();
            int index = 1;
            for (Product product : products.keySet()) {
                System.out.println(index++ + ". " +
                        product.getProductName() + " - " +
                        products.get(product) + " - " +
                        product.getPrice());
                productList.add(product);
            }
            return productList;
        }
    }

    public static class SellProductException extends Exception {
        // необходимо реализовать констркутор

        public SellProductException(String message) {
            super(message);
        }
    }

    public static class ConsoleService {
        private Shop shop;
        private Human human;

        public void start() {
            Scanner scanner = new Scanner(System.in);
            // Метод необходим для консольного управления программой

//       Метод используется при запуске приложения в методе main
//       и должен изначально требовать заполнить данные для магазина
//       и человека
//
//       Пользователю должны по очередно выводиться сообщения:
//
//       1. Задайте имя и стартовый капитал магазина
//       Пользователь вводит, к примеру DNS 20000.00
            System.out.println("Задайте имя и стартовый капитал магазина");
            System.out.println("например DNS 20000.00");
            String nameAndMoney = scanner.nextLine();
            String[] arrayInputLine = nameAndMoney.split("\s");
            shop = new Shop(
                    arrayInputLine[0],
                    Double.parseDouble(arrayInputLine[1])
            );

//       2. Укажите количество товаров - к примеру 3
            System.out.println("Укажите количество товаров");
            int productsNumber = Integer.parseInt(scanner.nextLine());
//
//       3. Количество товара = количество заполняемых товаров, в данном случае 3
//       Заполнение в формате: название товара, его стоимость и количество в наличии
//       К примеру - Пылесос 6000.00 3
            Map<Product, Integer> products = shop.products;
            System.out.println("Количество товара = количество заполняемых товаров");
            System.out.println("Заполнение в формате: название товара, его стоимость и количество в наличии");
            System.out.println("К примеру - Пылесос 6000.00 3");
            for (int i = 0; i < productsNumber; i++) {
                System.out.print("Товар " + (i + 1) + ": ");
                String item = scanner.nextLine();
                String[] items = item.split("\s");
                Product product = new Product(
                        items[0],
                        Double.parseDouble(items[1])
                );
                products.put(product, Integer.parseInt(items[2]));
            }

//       4. Предлагается заполнить данные о человеке - имя, фамилия,
//       и количество денежных средств
//       К примеру - Иван Иванов 200000.00
            System.out.println("Имя, фамилия, количество денег");
            System.out.println("К примеру - Иван Иванов 200000.00");
            String stringHuman = scanner.nextLine();
            String[] splitHuman = stringHuman.split("\s");
            human = new Human(
                    splitHuman[0],
                    splitHuman[1],
                    Double.parseDouble(splitHuman[2])
            );

//       После процесса заполнения пользователю должно вывестись меню
//       со следующими пунктами:
//       1. Посмотреть список товаров
//       2. Выход

//       При вводе в консоль 1 - пользователю выводится список продуктов
//       в соответствии с логикой метода printAndGetAllProductsWithCount класса Shop
//
//       При выборе какого-либо продукта из списка, по его позиции,
//       к примеру 2 - происходит процесс покупки человеком в соответсвии с логикой
//       метода buyProduct класса Human
//
//       После процесса покупки программа завершает работу
//
//       При вводе цифры 2 в консоль - программа завершает работу
            int menuItem;
            System.out.println("1. Посмотреть список товаров");
            System.out.println("2. Выход");
            menuItem = Integer.parseInt(scanner.nextLine());
            if (menuItem == 1) {
                List<Product> productList = shop.printAndGetAllProductsWithCount();
                System.out.print("Выберете продукт: ");
                int item = Integer.parseInt(scanner.nextLine()) - 1;
                if (item >= 0 && item < productList.size()) {
                    human.buyProduct(productList.get(item), shop);
                }else if(menuItem == 2){
                    return;
                }
            }
        }
    }}