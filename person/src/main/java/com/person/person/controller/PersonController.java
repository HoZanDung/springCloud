package com.person.person.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void savePerson() {
        System.out.println("保存一个用户");
    }
}
