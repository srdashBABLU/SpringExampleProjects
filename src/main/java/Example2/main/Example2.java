package Example2.main;

import Example2.beans.Vehicle2;
import Example2.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        // so here we are declaring a context of the project configuration 2 class
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        // our data type will be of vehicle2
        Vehicle2 veh = context.getBean(Vehicle2.class);
        // or we can use var keyword for not specifying the data type
        var veh2 = context.getBean(Vehicle2.class);

        System.out.println("Vehicle name from spring context is : " + veh.getName());
        System.out.println("Vehicle name from spring context is : " + veh2.getName());
    }
}
