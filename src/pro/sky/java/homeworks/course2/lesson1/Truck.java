package pro.sky.java.homeworks.course2.lesson1;



public class Truck extends WheelsTransport implements Repair{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceVehicle();
        for (int i = 0; i < this.getWheelsCount(); i++) {
           updateTyre();
        }
        checkEngine();
        checkTrailer();
        System.out.println();
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void serviceVehicle(){
        System.out.println("Обслуживаем автомобиль " + this.getModelName());
    }
}