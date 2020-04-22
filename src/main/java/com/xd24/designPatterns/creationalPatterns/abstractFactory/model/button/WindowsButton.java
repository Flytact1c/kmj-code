package com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 17:07
 */
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
