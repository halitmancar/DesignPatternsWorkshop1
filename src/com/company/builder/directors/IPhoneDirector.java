package com.company.builder.directors;

import com.company.builder.builders.PhoneBuilderInterface;
import com.company.builder.models.Brand;

public class IPhoneDirector {
    public void produceIPhone12(PhoneBuilderInterface phoneBuilder){
        phoneBuilder.setOperatingSystem("IOS");
        phoneBuilder.setBatteryCapacity(3000);
        phoneBuilder.setScreenSize(5.5);
        phoneBuilder.setBrand(Brand.Apple);
    }
    public void produceIPhone14ProMax(PhoneBuilderInterface phoneBuilder){
        phoneBuilder.setOperatingSystem("IOS");
        phoneBuilder.setScreenSize(6.1);
        phoneBuilder.setBatteryCapacity(4500);
        phoneBuilder.setBrand(Brand.Apple);
    }
}
