package static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "2.0");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Audi", "A6");
        System.out.println(Car.numberOfCars);
    }
}
