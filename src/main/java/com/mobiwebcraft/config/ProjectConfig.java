package com.mobiwebcraft.config;

import com.mobiwebcraft.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// this annotation configuration will be automaticcally call by the ioc container at the beans cration tinme






@Configuration
@ComponentScan(basePackages ="com.mobiwebcraft.beans" ) //this is the pojo class componenet
//the above is uded for the creation of the pojo class



public class ProjectConfig {




}







//    // due to the configuration what happen  it will look at the bean annoted tag , and it will look at the type of the annotation class
//
//    // it will got in the parameter so what happen accodingly as per the requirement basis it will call the proper fuinction accoding to the\
//    // type of the class mentioned
//
//    // example of the custom bean creation name
//    @Bean("audivehicle")
//    //other way is
//    //@Bean(value="audivehicle")
//    //@Bean(name="audivehicle")
//    Vehicle  vehicle1(){
//         var vehicle = new Vehicle();
//         vehicle.setName("Audi 8");
//         return vehicle;
//    }
//
//    @Primary
//    @Bean
//    Vehicle  vehicle2(){
//        var vehicle = new Vehicle();
//        vehicle.setName("BMW");
//        return vehicle;
//
//        // here BMW is the default  name that will call
//    }
//
//
//    @Bean("abibashbean")
//    Vehicle  vehicle3(){
//        var vehicle = new Vehicle();
//        vehicle.setName("honda");
//        return vehicle;
//    }
//
//
//    @Bean
//    String hello(){
//        return "Hello World";
//    }
//
//
//    @Bean
//    Integer number(){
//        return 16;
//    }
//
//
//
//
//}
