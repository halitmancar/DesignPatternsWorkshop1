package com.company.structural.proxy.proxies;

import com.company.structural.proxy.services.ExampleService;
import com.company.structural.proxy.services.IExampleService;

import java.util.HashMap;

public class ExampleServiceProxy implements IExampleService {
    private HashMap<Integer, Integer> squares = new HashMap<>();
    private IExampleService exampleService;

    public ExampleServiceProxy() {
        this.exampleService = new ExampleService();
    }

    @Override
    public int calculateSquare(int number) {
        if (!squares.containsKey(number)){
            int square = exampleService.calculateSquare(number);
            squares.put(number, square);
        }
        return squares.get(number);
    }
}
