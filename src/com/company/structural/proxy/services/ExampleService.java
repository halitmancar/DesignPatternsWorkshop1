package com.company.structural.proxy.services;

public class ExampleService implements IExampleService{
    @Override
    public int calculateSquare(int number) {
        for (int i=0; i<number; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e){}
        }
        return number*number;
    }
}
