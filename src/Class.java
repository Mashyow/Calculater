public class Class {
    public static void main(String[] args){
        /*System.out.println("                 РУБАИ");
        System.out.println("Много лет размышлял я над жизнь земной.");
        System.out.println("Непонятного нет для меня под луной.");
        System.out.println("Мне известно, что мне ничего не известно!");
        System.out.println("Вот последняя правда открытая мной.");
        System.out.println("                                    О.Хайам");*/

        byte b1 = -128;
        byte b2 = 127;

        short s1 = -32768;
        short s2 = 32767;

        int i1 = -2147483648;
        int i2 =  2147483647;

        long l1 = -1000000000000000000L;
        long l2 = 1000000000000000000L;

        float f1 = - 3.14f;
        float f2 = 3.14f;

        double d1 = - 5.3;
        double d2 = 4.4;

        char c1 = '5';
        char c2 = 'c';
        char c3 = 300; //это обращение к юникоду
        char c4 = '\u09AB';




        int a2 = 0b11110; //двоичная система счислений

        int а7 = 1_000_000_000; // использование андеркора(ниж подчерк) для удобства

        byte a = 12;
        byte b = 0b1100;
        byte c = 014;
        byte d = 0xC;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        short e = -1300;
        short f = -0b10100010100;
        short g =-02424;
        short q =-0x514;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(q);
        int j = 0;
        int w = 0b0 ;
        int p = 00;
        int r = 0x0;
        System.out.println(j);
        System.out.println(w);
        System.out.println(p);
        System.out.println(r);

        long v = 123456789L;
        long l = 0b111010110111100110100010101L;
        long n = 0726746425L;
        long u = 0x75BCD15L;
        System.out.println(v);
        System.out.println(l);
        System.out.println(n);
        System.out.println(u);

        float f7 = 56.89f;
        float f8 = 78.89f;
        System.out.println(f7);
        System.out.println(f8);
        double d9 = 678.877687;
        double d8 = 78.999999;
        System.out.println(d9);
        System.out.println(d8);

        boolean o1 = true;
        boolean o2 = false;
        System.out.println(o1);
        System.out.println(o2);

        char qwe = 'a';
        char rty = 700;
        char uio = '\01';
        System.out.println(qwe);
        System.out.println(rty);
        System.out.println(uio);
    }
}
