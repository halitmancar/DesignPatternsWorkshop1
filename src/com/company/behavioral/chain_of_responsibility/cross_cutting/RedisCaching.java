package com.company.behavioral.chain_of_responsibility.cross_cutting;

public class RedisCaching extends AbstractCrossCutter {
    @Override
    void process(String data) {
        System.out.println("Redis'e cachelendi.");
    }
}
