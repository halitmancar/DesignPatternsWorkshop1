package com.company.creational.builder.builders;

import com.company.creational.builder.models.Brand;
import com.company.creational.builder.models.Phone;

public interface PhoneBuilderInterface {
    void setOperatingSystem(String operatingSystem);
    void setBatteryCapacity(double batteryCapacity);
    void setScreenSize(double screenSize);
    void setBrand(Brand brand);

    Phone producePhone();
}
