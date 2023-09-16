public class Zadacha6 {static int[] mergeArrays(int[] firstArray, int[] secondArray) {
    int[] mergeArrays = new int[firstArray.length + secondArray.length];

    System.arraycopy(firstArray, 0, mergeArrays, 0, firstArray.length);
    System.arraycopy(secondArray, 0, mergeArrays, firstArray.length, secondArray.length);

    return mergeArrays;
}

}
