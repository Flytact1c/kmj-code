package com.xd24.designPatterns.creationalPatterns.factoryMethod;

/**
 * HTML button implementation.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 16:23
 */
public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
