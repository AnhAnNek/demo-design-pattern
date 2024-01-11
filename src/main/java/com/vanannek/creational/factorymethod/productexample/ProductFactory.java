package com.vanannek.creational.factorymethod.productexample;

public class ProductFactory {
    public static Product create(ProductType type) {
        switch (type) {
            case CAMERA:
                return new Camera();
            case LAPTOP:
                return new Laptop();
            default:
                return null;
        }
    }
}
