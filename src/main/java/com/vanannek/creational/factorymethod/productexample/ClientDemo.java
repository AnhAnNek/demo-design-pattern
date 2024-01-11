package com.vanannek.creational.factorymethod.productexample;

public class ClientDemo {
    public static void main(String[] args) {
        Product product1 = ProductFactory.create(ProductType.CAMERA);
        Product product2 = ProductFactory.create(ProductType.LAPTOP);

        System.out.println(product1.constructDescription());
        System.out.println("\n");
        System.out.println(product2.constructDescription());
    }
}
