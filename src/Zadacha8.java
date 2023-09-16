public class Zadacha8 {public static int getMinFromTwo(int x, int y){
    int min = Math.min(x,y);
    return min;
}
    public static int getMinFromFour(int x, int y, int m, int n){
        int min = getMinFromTwo(x,y);
        return Math.min(min, Math.min(m,n));
    }
}
