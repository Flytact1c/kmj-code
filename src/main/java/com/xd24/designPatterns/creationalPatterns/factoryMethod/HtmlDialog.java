package com.xd24.designPatterns.creationalPatterns.factoryMethod;

/**
 * HTML Dialog will produce HTML buttons.HTML Dialog will produce HTML buttons.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 16:31
 */
public class HtmlDialog implements Dialog{


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
