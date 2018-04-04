package com.ui.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonHystrixService {

    @Autowired
    PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public void save() {
        System.out.println("调用PersonService的断路器");
    }

    public void fallbackSave() {
        System.out.println("PersonService故障");
    }
}
