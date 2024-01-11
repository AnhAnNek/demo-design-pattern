package com.vanannek.creational.factorymethod.buttonexample;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
