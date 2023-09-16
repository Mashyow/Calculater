public class ClassLessen {
    public static void main (String[] args){


        int c  = 1/1; // получаем целое число без остатка
        int d = 1%1; // получаем остаток

        //++ -- унарные операторы

        int x = 5;
        int y = 3;

        int z = ++x + y--;
        // операторы присваивания = , += ,-=
        // операторы сравнения > < == =< >=  !=
        // логические операторы &&(и) ||(или)

        int i1 =5;
        int i2 = 11;
        double d1 =5.5;
        double d2 =1.3;
        long L = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - L;
        System.out.println(result);



        int a = 5;
        int b = 8;
        int v = a-- - --a + ++a + a++ + a;
        int n = ++b - b++ + ++b - --b;
        System.out.println(v);
        System.out.println(n);











    }
}
