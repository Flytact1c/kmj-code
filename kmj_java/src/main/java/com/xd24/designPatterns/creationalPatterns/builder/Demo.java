package com.xd24.designPatterns.creationalPatterns.builder;

import com.xd24.designPatterns.creationalPatterns.builder.model.Car;
import com.xd24.designPatterns.creationalPatterns.builder.model.Manual;

/**
 * Demo class. Everything comes together here.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 19:46
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
