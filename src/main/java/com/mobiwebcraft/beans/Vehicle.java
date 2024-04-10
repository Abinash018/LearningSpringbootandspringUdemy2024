package com.mobiwebcraft.beans;

// this is the pojo class where we will be define our requirement

import org.springframework.beans.factory.annotation.Autowired;
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

    //  Auto wiring
    //other class in to this class

    //

//    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.name = vehicle.getName();
//    }





    public void printhello(){

        System.out.println("printing hello from compononet vehicle bean");
    }
}
