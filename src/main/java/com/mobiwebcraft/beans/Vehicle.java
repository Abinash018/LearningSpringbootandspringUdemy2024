package com.mobiwebcraft.beans;

// this is the pojo class where we will be define our requirement

import org.springframework.stereotype.Component;

@Component
// veicle pojo class
public class Vehicle {

    private String name;

    public String getName() {
        return name;

        // this is the getter that we are using
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printhello(){

        System.out.println("printing from compononet vehicle bean");
    }
}
