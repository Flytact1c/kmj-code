package com.xd24.designPatterns.creationalPatterns.builder;

import com.xd24.designPatterns.creationalPatterns.builder.model.Type;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Engine;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.GPSNavigator;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Transmission;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.TripComputer;

/**
 * 主管控制生成器
 *
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 19:45
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
