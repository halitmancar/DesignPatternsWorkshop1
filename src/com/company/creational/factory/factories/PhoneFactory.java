package com.company.creational.factory.factories;

import com.company.creational.factory.phone.IPhone;
import com.company.creational.factory.phone.Samsung;

public class PhoneFactory {
    public IPhone producePhone(){
        return new Samsung();
    }
}
