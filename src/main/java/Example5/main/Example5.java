package Example5.main;

import Example5.beans.Vehicle5;
import Example5.config.ProjectConfig5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    // Creating beans with the help of @Component annotation !
    public static void main(String[] args) {
        // we can use the @component annotation for getting relief from the creation of objects
        // that's for today we will continue from tomorrow !
        // to make the developer life easy we can use @Component annotation!
        // it is one of the stereotype type annotation inside java spring framework
        // we will use for the general purpose
        // for database use @Repository annotation !
        // for service layer @Service
        // for control layer @Controller
        // we can use it on any pojo class ! @Component
        var context = new AnnotationConfigApplicationContext(ProjectConfig5.class);
        var vehicle = context.getBean(Vehicle5.class);
        vehicle.setName("Ferrari");
        System.out.println("component name from Spring context is : " + vehicle.getName());
        vehicle.greet();

        // got what we are expecting !
    }
}