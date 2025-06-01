package Example4.main;

import Example4.beans.Vehicle4;
import Example4.config.ProjectConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        // since we have seen how to create beans,
        // how to get beans with a name
        // how to handel the nouniquebeandefinationexception
        // and how to give custom name to the beans !

        // now lets see how to handel the Exception if we have more than 1 bean in the Ioc container
        // without specifying the name of the bean !
        // by using the @Primary annotation !

        // the same context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig4.class);

        // let's get the variable !
        var veh = context.getBean(Vehicle4.class);

        // let's print the value of the bean !
        System.out.println("Vehicle1 name from spring context is : " + veh.getName());
        // well we didn't get the error this time !


        // if you annotate multiple beans with the primary key then you will get the same error !
    }
}
