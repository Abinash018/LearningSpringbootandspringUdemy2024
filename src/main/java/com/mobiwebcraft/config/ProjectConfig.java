package com.mobiwebcraft.config;

import com.mobiwebcraft.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

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
