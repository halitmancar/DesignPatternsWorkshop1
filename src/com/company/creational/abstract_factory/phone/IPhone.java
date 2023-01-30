package com.company.creational.abstract_factory.phone;


public class IPhone extends Phone{
    @Override
    public void produce() {
        System.out.println("IPhone produced...");
    }
}
