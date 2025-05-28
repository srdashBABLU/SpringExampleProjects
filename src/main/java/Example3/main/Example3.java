package Example3.main;

import Example3.beans.Vehicle3;
import Example3.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {

        // now we understood that how to get the different beans of the same class by their name
        // lets see how we can set the custom name for the beans instead of using the java method name !
        // like before vehicle1, vehicle2, vehicle3 etc !!

        // same as before we need the context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);

        // let's get the variable !
        var veh = context.getBean("audi",Vehicle3.class);

        // let's print the value of the bean !
        System.out.println("Vehicle1 name from spring context is : " + veh.getName());
        // and it works !

        // lets see some other ways to specify the name ! of the bean !
        // let's get the variable !\

        var veh2 = context.getBean("honda",Vehicle3.class);

        // let's print the value of the bean !
        System.out.println("Vehicle2 name from spring context is : " + veh2.getName());
        // and we got the name again !

        // lets see the other way !
        // let's get the variable !
        var veh3 = context.getBean("ferrari",Vehicle3.class);

        // let's print the value of the bean !
        System.out.println("Vehicle3 name from spring context is : " + veh3.getName());
        // it works too !
    }
}
