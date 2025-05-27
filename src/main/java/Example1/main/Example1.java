package Example1.main;

import Example1.beans.Vehicle;
import Example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        // the 1st way !
        // getting the vehicle names using pojo (plain old java object)
        var veh1 = new Vehicle();
        veh1.setName("mercedes");
        System.out.println("The Name of the vehicle (non-spring Context) is : " + veh1.getName());
        System.out.println("The Number is : " + veh1.number);
        // the above code will create an object of the Vehicle class,
        // then set the name of the vehicle as "mercedes"
        // then fetch the saved name and number from the object(pojo)


        // the 2nd way !
        // getting the name using spring context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Inversion Of control (IOC)
        // Ioc refers to the transfer the ability to modify the code from inside to outside !
        // context is a part of the ioc(Inversion of control) container !
        // context has some methods !
        Vehicle veh = context.getBean(Vehicle.class); // we can explicitly mention the variable type !
        // we are passing the vehicle class to the get bean method !
        // which will return the spring bean that is of the corresponding class !
        // this only works if there is only one bean of the following class !
        // if there is many then it throws exception !
        System.out.println("Vehicle name from spring context is : " + veh.getName());
        // since we got the entire object from our spring context !
        // so we need to get the value we want from the object by calling the member functions !

        var hello = context.getBean(String.class);
        // we don't need to mention the variable type if we use var !
        System.out.println("String name from spring context is : " + hello);
        var num = context.getBean(Integer.class);
        System.out.println("Vehicle name from spring context is : " + num);

    }

}
