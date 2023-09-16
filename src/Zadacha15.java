public class Zadacha15 {
    void testCatchException(int a, int b) {
    try {
        if (b == 0) throw new ArithmeticException();
        int result = a / b;
        System.out.println(result);
    } catch (ArithmeticException ex) {
        System.out.println("На 0 делить нельзя");
    }}
}
