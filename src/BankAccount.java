public class BankAccount {
    int balanc = 50;

    void popolnenieScheta(int a){
        balanc+=a;

    }
     void snyatieSoScheta(int b){
        balanc-=b;

    }

}

class Cochelek{
    public static void main(String[] args){
        BankAccount t = new BankAccount();

        t.popolnenieScheta(50);
        System.out.println(t.balanc);

        BankAccount s = new BankAccount();
        s.snyatieSoScheta(30);
        System.out.println(s.balanc);

    }
}