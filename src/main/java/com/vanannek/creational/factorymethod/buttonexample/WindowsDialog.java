package com.vanannek.creational.factorymethod.buttonexample;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
