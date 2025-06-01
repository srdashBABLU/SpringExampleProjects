package Example8.main;

import Example8.beans.Vehicle8;
import Example8.config.ProjectConfig8;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8 {
    public static void main(String[] args) {
        // since we have discovered how to create beans manually !
        // we should discover how to create beans automatically when a certain condition is met
        // or we want to add it!
        // we can use context.registerBean() method for that !

        // first of all we need the context var!
        var context = new AnnotationConfigApplicationContext(ProjectConfig8.class);

        var volkswagen = new Vehicle8();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle8> volkswagenSupplier = () -> volkswagen;
        // in the above line we have created a supplier of type Vehicle8
        // and assigned a lambda function to it that returns volkswagen object from the spring context

        Supplier<Vehicle8> audiSupplier = () -> {
            var audi = new Vehicle8();
            audi.setName("Audi A8");
            return audi;
        };
        // the above is also a Lambda function that returns the audi object
        // created inside the lambda scope
        // no difference between the two ways of declaration !

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("random number is : " + randomNumber);

        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagen", Vehicle8.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle8.class, audiSupplier);
        }

        Vehicle8 volksVeh = null;
        Vehicle8 audiVeh = null;

        try {
            volksVeh = context.getBean("volkswagen", Vehicle8.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Volkswagen bean not created !");
        }

        try {
            audiVeh = context.getBean("audi", Vehicle8.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Audi bean not created !");
        }

        if (null != volksVeh) {
            System.out.println("Vehicle name from spring context is : " + volksVeh.getName());
        } else {
            System.out.println("Vehicle name from spring context is : " + audiVeh.getName());
        }

    }
}
