package com.xd24.designPatterns.creationalPatterns.factoryMethod;

/**
 * Demo class. Everything comes together here.
 *
 * @Author: shuifu
 * @Date: 2020/4/22 16:33
 */
public class Demo {

    private  Dialog  dialog;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.configure();
        demo.runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    void runBusinessLogic() {
        dialog.renderWindow();
    }
}
