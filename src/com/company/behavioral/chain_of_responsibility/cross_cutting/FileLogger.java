package com.company.behavioral.chain_of_responsibility.cross_cutting;

public class FileLogger extends AbstractCrossCutter{
    @Override
    void process(String data) {
        System.out.println("File'a loglandı.");
    }
}
