package pro.sky.java.homeworks.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2",4);

        Truck truck = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2",8);

        Bicycle bicycle = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2",2);


        ServiceStation station = new ServiceStation();
        station.service(car);
        station.service(car2);
        station.service(truck);
        station.service(truck2);
        station.service(bicycle);
        station.service(bicycle2);
    }
}