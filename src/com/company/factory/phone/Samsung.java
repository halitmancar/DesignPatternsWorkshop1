package com.company.factory.phone;

public class Samsung implements IPhone{
    @Override
    public void produce() {
        System.out.println("Samsung produced...");
    }
}
