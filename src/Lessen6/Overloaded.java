package Lessen6;

public class Overloaded {


    public Overloaded(int a, int b) {
    }

    int overloaded(int a , int b) {
        return a+b;

    }
    int overloaded(int a1, int b1 ,int c1) {


        return a1;
    }



}

class Summa{
    public static void main(String[] args){
        Overloaded rip = new Overloaded(7,8);


        Overloaded rip1 = new Overloaded(8,8);

        Overloaded rip2 = new Overloaded(8,8);
        rip2.overloaded(1,2,3);


    }
}
