package com.company.abstract_factory;

import com.company.abstract_factory.factories.AppleFactory;
import com.company.abstract_factory.factories.HuaweiFactory;
import com.company.abstract_factory.services.CustomerService;
import com.company.abstract_factory.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new AppleFactory());
        customerService.buy();

        System.out.println("***************************");

        ICustomerService customerService1 = new CustomerService(new HuaweiFactory());
        customerService1.buy();
    }
}
