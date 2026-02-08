package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is:"+vehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is:"+hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is:"+num);


    }
}
