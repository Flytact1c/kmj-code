package com.xd24.designPatterns.creationalPatterns.abstractFactory.model;

import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.Button;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.Checkbox;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 17:15
 */
public class Application {

    private Button  button;

    private Checkbox  checkbox;

    public Application(GUIFactory  factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public  void  paint(){
        button.paint();
        checkbox.paint();
    }
}
