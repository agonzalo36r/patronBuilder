package refactoring_guru.builder.example;

import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.builders.CarBuilder;
import refactoring_guru.builder.example.builders.CarManualBuilder;
import refactoring_guru.builder.example.cars.Manual;
import refactoring_guru.builder.example.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        System.out.println("\n-----------------------------------\n");

        CarBuilder builder2 = new CarBuilder();

        director.constructSUV(builder2);
        Car car2 = builder2.getResult();
        System.out.println("Car built:\n" + car2.getCarType());
        CarManualBuilder manualBuilder2 = new CarManualBuilder();

        director.constructSUV(manualBuilder2);
        Manual carManual2 = manualBuilder2.getResult();
        System.out.println("\nCar manual built:\n" + carManual2.print());

    }

}