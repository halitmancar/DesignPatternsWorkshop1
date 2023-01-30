package com.company.behavioral.null_object.cachers;

public class RedisCacher implements ICacher{
    @Override
    public void cache() {
        System.out.println("Redis'e cachelendi...");
    }
}
