package com.company.behavioral.null_object.services;

import com.company.behavioral.null_object.cachers.ICacher;

public class ExampleService implements IExampleService{

    private ICacher cacher;

    public ExampleService(ICacher cacher) {
        this.cacher = cacher;
    }

    @Override
    public void getData() {
        cacher.cache();
        System.out.println("Data getirildi...");
    }
}
