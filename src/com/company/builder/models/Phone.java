package com.company.builder.models;

public class Phone {
    public String operatingSystem;
    public double batteryCapacity;
    public double screenSize;
    public Brand brand;

    @Override
    public String toString() {
        return "Phone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", brand=" + brand +
                '}';
    }
}
