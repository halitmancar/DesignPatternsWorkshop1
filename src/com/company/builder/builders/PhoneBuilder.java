package com.company.builder.builders;

import com.company.builder.models.Brand;
import com.company.builder.models.Phone;

public class PhoneBuilder implements PhoneBuilderInterface{
    Phone phone = new Phone();

    @Override
    public void setOperatingSystem(String operatingSystem) {
        phone.operatingSystem = operatingSystem;
    }

    @Override
    public void setBatteryCapacity(double batteryCapacity) {
        phone.batteryCapacity = batteryCapacity;
    }

    @Override
    public void setScreenSize(double screenSize) {
        phone.screenSize = screenSize;
    }

    @Override
    public void setBrand(Brand brand) {
        phone.brand = brand;
    }

    @Override
    public Phone producePhone() {
        return phone;
    }
}
