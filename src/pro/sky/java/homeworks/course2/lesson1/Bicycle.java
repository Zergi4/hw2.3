package pro.sky.java.homeworks.course2.lesson1;


public class Bicycle extends WheelsTransport implements Repair {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
    }

    public void updateTyre() {

        System.out.println("Меняем покрышку велосипеда");
    }

    public void serviceVehicle() {
        System.out.println("Обслуживаем автомобиль " + this.getModelName());
    }
}