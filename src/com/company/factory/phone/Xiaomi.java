package com.company.factory.phone;

public class Xiaomi implements IPhone{
    @Override
    public void produce() {
        System.out.println("Xiaomi produced...");
    }
}
