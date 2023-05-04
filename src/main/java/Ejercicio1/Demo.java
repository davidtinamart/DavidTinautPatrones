package Ejercicio1;

import Ejercicio1.builders.ManualConstructorBase;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Base base = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        ManualConstructorBase manualBuilder = new ManualConstructorBase();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}