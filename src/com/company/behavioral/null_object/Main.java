package com.company.behavioral.null_object;

import com.company.behavioral.null_object.cachers.RedisCacher;
import com.company.behavioral.null_object.cachers.StubCacher;
import com.company.behavioral.null_object.services.ExampleService;
import com.company.behavioral.null_object.services.IExampleService;

public class Main {
    public static void main(String[] args) {
        IExampleService exampleService = new ExampleService(new RedisCacher());
        exampleService.getData();

        IExampleService exampleService1 = new ExampleService(new StubCacher());
        exampleService1.getData();
    }
}
