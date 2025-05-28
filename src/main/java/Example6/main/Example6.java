package Example6.main;

import Example6.beans.Vehicle6;
import Example6.config.ProjectConfig6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    // @PostConstruct annotation
    // this annotation will be helpful if we use stereotype annotation like
    // @Component annotation
    // @PostConstruct will help the developer to modify the bean after creation automatically !
    // let's demonstrate that !
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig6.class);
        Vehicle6 vehicle = context.getBean(Vehicle6.class);
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getName());
        vehicle.greet();
        context.close();
    }
}
