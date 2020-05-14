package com.xd24.designPatterns.creationalPatterns.abstractFactory.model;

import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.Button;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.MacOSButton;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.Checkbox;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.MacOSCheckbox;

/**
 * @Author: shuifu
 * @Date: 2020/4/22 17:12
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
