package com.xd24.designPatterns.creationalPatterns.builder.model.components;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 18:23
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
