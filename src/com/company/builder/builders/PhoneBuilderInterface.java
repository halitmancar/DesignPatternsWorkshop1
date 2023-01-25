package com.company.builder.builders;

import com.company.builder.models.Brand;
import com.company.builder.models.Phone;

public interface PhoneBuilderInterface {
    void setOperatingSystem(String operatingSystem);
    void setBatteryCapacity(double batteryCapacity);
    void setScreenSize(double screenSize);
    void setBrand(Brand brand);

    Phone producePhone();
}
