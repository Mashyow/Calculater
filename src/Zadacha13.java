public class Zadacha13 {public static class Human{
    String name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.print("Привет, меня зовут " + name + ", " + "мне " + age + " лет.");
    }
}
    public static void main(String[] args){
        Human human = new Human("Denis", 29);
        human.sayHello();
    }
}
