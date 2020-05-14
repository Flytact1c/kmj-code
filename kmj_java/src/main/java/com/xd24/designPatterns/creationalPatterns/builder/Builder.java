package com.xd24.designPatterns.creationalPatterns.builder;

import com.xd24.designPatterns.creationalPatterns.builder.model.Type;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Engine;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.GPSNavigator;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.Transmission;
import com.xd24.designPatterns.creationalPatterns.builder.model.components.TripComputer;

/**
 * 通用生成器接口
 *
 * @Author: shuifu
 * @Date: 2020/4/22 18:19
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
