package com.mobiwebcraft.beans;

// this is the pojo class where we will be define our requirement

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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



     //this is the main programme that will be used in the end of the programme




    @component
    public class person{

        private string name = "Luxury";
        private final Vehicle vehicle;

        @Autowired



        //As per the name of the bean that will be work accodingly
        // so if you want any name accodingly iy
        public person (@Qualifier("vehicle2") Vehicle vehicle) {

            System.out.println("person bean created by the spring ");
            this.vehicle = vehicle;
        }
    }









    public void printhello(){

        System.out.println("printing hello from compononet vehicle bean");
    }
}
