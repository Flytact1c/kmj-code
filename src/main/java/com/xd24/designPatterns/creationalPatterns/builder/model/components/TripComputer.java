package com.xd24.designPatterns.creationalPatterns.builder.model.components;

import com.xd24.designPatterns.creationalPatterns.builder.model.Car;

/**
 *
 *
 * @Author: shuifu
 * @Date: 2020/4/22 18:31
 *
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
