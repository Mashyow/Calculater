public class Zadacha11 {public static boolean determineAdult(int age) {
    if (age<0){
        System.out.println("Ошибка! Введите правильный возраст.");
        return false ;
    }
    if(age>=18){
        return true;
    } else {
        return false;
    }

}
}
