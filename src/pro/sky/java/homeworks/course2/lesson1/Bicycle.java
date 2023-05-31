package pro.sky.java.homeworks.course2.lesson1;

import pro.sky.java.homeworks.course2.lesson1.WheelsTransport;

public class Bicycle extends  WheelsTransport implements Repair {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < super.getWheelsCount(); i++) {
            updateTyre();
        }

        }
    public void updateTyre() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку велосипеда");
        }
    }
}