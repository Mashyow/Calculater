public class Zadacha7 {public void printArray(int[] array) {
    fillArray(array);

}

    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
            System.out.println(array[i]);
        }
    }
}
