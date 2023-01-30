package com.company.structural.proxy;

import com.company.structural.proxy.proxies.ExampleServiceProxy;
import com.company.structural.proxy.services.ExampleService;
import com.company.structural.proxy.services.IExampleService;

public class Main {
    public static void main(String[] args) {
        IExampleService exampleService = new ExampleServiceProxy();
        System.out.println(exampleService.calculateSquare(3));
        System.out.println(exampleService.calculateSquare(5));
        System.out.println(exampleService.calculateSquare(3));
        System.out.println(exampleService.calculateSquare(5));

    }
}
