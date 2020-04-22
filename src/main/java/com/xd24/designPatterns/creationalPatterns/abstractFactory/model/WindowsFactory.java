package com.xd24.designPatterns.creationalPatterns.abstractFactory.model;

import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.Button;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.WindowsButton;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.Checkbox;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.WindowsCheckbox;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 17:13
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
