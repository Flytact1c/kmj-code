package com.xd24.designPatterns.creationalPatterns.builder;

import com.xd24.designPatterns.creationalPatterns.builder.model.Manual;
import com.xd24.designPatterns.creationalPatterns.builder.model.Type;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Engine;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.GPSNavigator;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Transmission;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.TripComputer;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 18:41
 */
public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
