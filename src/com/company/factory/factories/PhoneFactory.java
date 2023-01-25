package com.company.factory.factories;

import com.company.factory.phone.IPhone;
import com.company.factory.phone.Samsung;
import com.company.factory.phone.Xiaomi;

public class PhoneFactory {
    public IPhone producePhone(){
        return new Samsung();
    }
}
