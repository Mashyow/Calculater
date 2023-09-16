
public class Zadacha1 {
    public static void main(String[] args){

        String text = "Palidrom";
        class isPalindrome{
        public static boolean isPalindrome(String text) {
            Zadacha1 zadacha1 = new Zadacha1();

        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        String str1 = str.toString();
        boolean retVal;
        retVal = text.equalsIgnoreCase(str1);
        return retVal;
    }
}}
}
