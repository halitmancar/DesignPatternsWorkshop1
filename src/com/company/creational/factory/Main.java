package com.company.creational.factory;

import com.company.creational.factory.factories.PhoneFactory;
import com.company.creational.factory.phone.IPhone;

public class Main {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        IPhone phone = factory.producePhone();
        phone.produce();

        IPhone phone2 = factory.producePhone();
        phone2.produce();

        IPhone phone3 = factory.producePhone();
        phone3.produce();

        IPhone phone4 = factory.producePhone();
        phone4.produce();
    }
}
