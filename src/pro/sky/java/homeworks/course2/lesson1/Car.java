package pro.sky.java.homeworks.course2.lesson1;


public class Car extends WheelsTransport implements Repair {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        System.out.println();
    }

}