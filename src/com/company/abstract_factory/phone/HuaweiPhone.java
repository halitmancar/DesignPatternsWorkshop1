package com.company.abstract_factory.phone;

public class HuaweiPhone extends Phone{
    @Override
    public void produce() {
        System.out.println("Huawei phone produced...");
    }
}
