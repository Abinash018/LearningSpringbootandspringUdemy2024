package com.mobiwebcraft.main;

import com.mobiwebcraft.beans.Vehicle;
import com.mobiwebcraft.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Honda City");
//        System.out.println("Vehicle Name from non spring context is : " + vehicle.getName());

     //   var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var context = new ClassPathXmlApplicationContext("beans.xml");
         Vehicle vehicle =  context.getBean(Vehicle.class);
         System.out.println("vehicle name from spring Context is "+vehicle.getName());

        //
//        Vehicle volkswagen = new Vehicle();
//        volkswagen.setName("Volkswagen");
//        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;
//
//        Supplier<Vehicle> audiSupplier = () -> {
//
//             Vehicle audi = new Vehicle();
//             audi.setName("Audi");
//             return audi;
//        };
//
//
//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
//        System.out.println("Random number: " + randomNumber);
//
//
//        if((randomNumber % 2) == 0) {
//
//            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
//        }
//
//        else {
//            context.registerBean("audi", Vehicle.class,audiSupplier);
//
//        }
//
//        Vehicle volksVehicle = null ;
//        Vehicle audiVehicle = null ;
//
//        try {
//
//            volksVehicle = context.getBean("volkswagen", Vehicle.class);
//
//        }
//        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
//
//            System.out.println("Error while creating Volkswagen vehicle ") ;
//        }
//
//        try{
//            audiVehicle = context.getBean("audi", Vehicle.class);
//
//        }
//        catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
//            System.out.println("Error while creating Audi vehicle ") ;
//        }

//        //Vehicle veh = context.getBean("audivehicle",Vehicle.class);
//        Vehicle veh = context.getBean(Vehicle.class);
//
//        // resolve for the no unique bean
//
//        System.out.println("vehicle Name from  spring context is : " + veh.getName());
//        veh.printhello();
//        String hello = context.getBean(String.class);
//        System.out.println("String value from  spring context is : " + hello);
//        Integer num = context.getBean(Integer.class);
//        System.out.println("Integer value from  spring context is : " + num);

        //  pojo  :  plane old java object
         // @component :  base of the @service , @reposotary , @controller
    }
}
