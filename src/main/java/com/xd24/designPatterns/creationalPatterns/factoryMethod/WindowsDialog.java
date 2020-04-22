package com.xd24.designPatterns.creationalPatterns.factoryMethod;

/**
 * Windows Dialog will produce Windows buttons.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 16:32
 */
public class WindowsDialog implements Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
