package com.xd24.designPatterns.creationalPatterns.abstractFactory.model;

import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.button.Button;
import com.xd24.designPatterns.creationalPatterns.abstractFactory.model.checkbox.Checkbox;

/**
 *
 * @Author: shuifu
 * @Date: 2020/4/22 17:11
 */
public interface GUIFactory {

    Button  createButton();

    Checkbox  createCheckbox();
}
