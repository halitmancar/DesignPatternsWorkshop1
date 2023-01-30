package com.company.creational.builder;

import com.company.creational.builder.builders.PhoneBuilder;
import com.company.creational.builder.builders.PhoneBuilderInterface;
import com.company.creational.builder.directors.IPhoneDirector;
import com.company.creational.builder.models.Phone;

public class Main {
    public static void main(String[] args) {
        PhoneBuilderInterface phoneBuilder = new PhoneBuilder();
        IPhoneDirector iPhoneDirector = new IPhoneDirector();

        iPhoneDirector.produceIPhone12(phoneBuilder);
        Phone phone = phoneBuilder.producePhone();
        System.out.println(phone.toString());

        iPhoneDirector.produceIPhone14ProMax(phoneBuilder);
        Phone phone1 = phoneBuilder.producePhone();
        System.out.println(phone1.toString());

    }
}
