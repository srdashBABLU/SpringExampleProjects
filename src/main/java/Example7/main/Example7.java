package Example7.main;

import Example7.beans.Vehicle7;
import Example7.config.ProjectConfig7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.Document;

public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig7.class);
        var vehicle = context.getBean(Vehicle7.class);
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getName());
        vehicle.greet();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt flag
            System.out.println("Sleep interrupted");
        }
        context.close();
    }
}
