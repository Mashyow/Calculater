public class Student {
    int numBilet ;
    String name;
    String famaly;
    int Years;
    int srMat;
    int srEko;
    int srIng;
     int Sram(int i, int i1, int i2) {
        int sram = (i+i1+i2)/3;
        return sram;
    }


}

class StudendTest {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        int sram1 = a.Sram(5,6,4);
        System.out.println(sram1);


        b.srMat = 2;
        b.srEko = 3;
        b.srIng = 5;

        c.srMat = 3;
        c.srEko = 5;
        c.srIng = 4;

        double sr1;
        double sr2;
        double sr3;

        sr1 = (a.srMat + a.srEko + a.srIng) / 3;
        System.out.println(sr1);
        sr2 = (b.srMat + b.srEko + b.srIng) / 3;
        System.out.println(sr2);
        sr3 = (c.srMat + c.srEko + c.srIng) / 3;
        System.out.println(sr3);


    }

}