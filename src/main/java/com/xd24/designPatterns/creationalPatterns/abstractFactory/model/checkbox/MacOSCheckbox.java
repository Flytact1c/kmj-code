package com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 17:09
 */
public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
