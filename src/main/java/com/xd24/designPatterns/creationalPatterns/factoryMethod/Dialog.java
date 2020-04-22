package com.xd24.designPatterns.creationalPatterns.factoryMethod;

/**
 * 窗口
 *
 * @Author: shuifu
 * @Date: 2020/4/22 16:27
 */
public interface Dialog {

    /**
     * 渲染按钮
     */
    default void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 创建按钮
     *
     *  Subclasses will override this method in order to create specific button
     *       objects.
     *
     * @return
     */
    public Button createButton();
}
