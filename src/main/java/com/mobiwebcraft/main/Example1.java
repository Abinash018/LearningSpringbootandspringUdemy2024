package com.mobiwebcraft.main;

import com.mobiwebcraft.beans.Vehicle;
import com.mobiwebcraft.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Honda City");
//        System.out.println("Vehicle Name from non spring context is : " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Vehicle veh = context.getBean("audivehicle",Vehicle.class);
        Vehicle veh = context.getBean(Vehicle.class);

        // resolve for the no unique bean

        System.out.println("vehicle Name from  spring context is : " + veh.getName());
        veh.printhello();
//        String hello = context.getBean(String.class);
//        System.out.println("String value from  spring context is : " + hello);
//        Integer num = context.getBean(Integer.class);
//        System.out.println("Integer value from  spring context is : " + num);

    }
}
