package Lessen6;

public class MethodOverLoading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(String i2){
        System.out.println(i2);
    }
    void show(double i3){
        System.out.println(i3);
    }
}

class MethodOverLoadingTest{
    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        int a =500;
        mo.show(a);
        String b ="Petr";
        mo.show(b);
        double c = 5.5;
        mo.show(c);
    }
}