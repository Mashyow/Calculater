public class Car1 {public static class Car {
    private String modelName;
    private Float fuelQuantity;
    private Driver driver = null;

    public Car(String modelName, Float fuelQuantity) {
        this.modelName = modelName;
        this.fuelQuantity = fuelQuantity;
    }
    public void drive(Driver driver) {
        System.out.println("Ну что " + driver.getDriverName() + ", " + getModelName() +" отвезет тебя куда угодно");
        this.driver = driver;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public float getFuelQuantity() {
        return fuelQuantity;
    }
    public void setFuelQuantity(float fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
    public Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver driver){
        this.driver = driver;
    }

}
    public static class Driver {

        private String driverName;
        private Car car;

        public Driver(String driverName, Car car) {
            this.driverName = driverName;
            this.car = car;
        }

        public void driveByCar() {
            if (car.getFuelQuantity() <= 0.0f) {
                System.out.println("Сегодня я никуда не поеду");
            } else {
                if (car.getFuelQuantity() < 10.0f) {
                    System.out.println("Ох, доехать бы до заправки");
                    car.drive(this);
                } else {
                    System.out.println("Вроде права не забыл, ну поехали");
                    car.drive(this);
                }
            }
        }
        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }
        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }
    }
}
