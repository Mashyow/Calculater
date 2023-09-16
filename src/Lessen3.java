public class Lessen3 {
    int id;          //можно этим переменным присвоить значения сразу, тогда вновь оъявленные объекты
    String name;  //будут принимать эти значения , если не создать и не присвоить им значения в мейн
    double balance;
    public static void main(String [] args){
        Lessen3 ba = new Lessen3();
        Lessen3 bb = new Lessen3();
        Lessen3 bc = new Lessen3();

        ba.id = 1;
        ba.name = "Denis";
        ba.balance = 10000000000000.345;

        bb.id = 6;
        bb.name = "Pavel";
        bb.balance = 56.3;

        bc.id = 3;
        bc.name = "Constantin";
        bc.balance = 78.3989;

    }
}
