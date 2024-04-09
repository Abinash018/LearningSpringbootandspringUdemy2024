package com.mobiwebcraft.config;

import com.mobiwebcraft.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




// this annotation configuration will be automaticcally call by the ioc container at the beans cration tinme






@Configuration
public class ProjectConfig {

    // due to the configuration what happen  it will look at the bean annoted tag , and it will look at the type of the annotation class

    // it will got in the parameter so what happen accodingly as per the requirement basis it will call the proper fuinction accoding to the\
    // type of the class mentioned

    @Bean
    Vehicle  vehicle(){
         var vehicle = new Vehicle();
         vehicle.setName("Audi 8");
         return vehicle;
    }

    @Bean
    String hello(){
        return "Hello World";
    }


    @Bean
    Integer number(){
        return 16;
    }




}
