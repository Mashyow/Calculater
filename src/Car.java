public class Car {
    String color;
    String engines;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }
    void showInfo(){
        System.out.println("cvet: " + color + " мотор: " + engines + " скорость "+ speed);
    }

}
class TestCar{
    public static void main(String[] args){
        Car w = new Car();
        w.color = "красный";
        w.engines = "v12";
        w.speed = 60;

        w.gaz(20);
        w.showInfo();


    }
}
