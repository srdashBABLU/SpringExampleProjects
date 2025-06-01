package Example1.main;

import Example1.beans.Vehicle;
import Example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpeedTest {
    public static void main(String[] args) {
        objTime(); // 6-ms
        contextTime(); // 456-ms

        // from the above test we concluded that the
        // spring context is 75x slower than POJO
    }

    public static void objTime() {
        // Using nanoTime for more precision
        long startNano = System.nanoTime();

        // Using currentTimeMillis (optional)
        long startMilli = System.currentTimeMillis();

        // Code block whose execution time is to be measured
        objTask();

        // End time
        long endNano = System.nanoTime();
        long endMilli = System.currentTimeMillis();

        // Calculate elapsed time
        long durationNano = endNano - startNano;
        long durationMilli = endMilli - startMilli;

        System.out.println("Execution Time (nanoseconds): " + durationNano);
        System.out.println("Execution Time (milliseconds): " + durationMilli);
        System.out.println("Execution Time (seconds): " + (durationNano / 1_000_000_000.0));
    }

    public static void contextTime() {
        // Using nanoTime for more precision
        long startNano = System.nanoTime();

        // Using currentTimeMillis (optional)
        long startMilli = System.currentTimeMillis();

        // Code block whose execution time is to be measured
        contextTask();

        // End time
        long endNano = System.nanoTime();
        long endMilli = System.currentTimeMillis();

        // Calculate elapsed time
        long durationNano = endNano - startNano;
        long durationMilli = endMilli - startMilli;

        System.out.println("Execution Time (nanoseconds): " + durationNano);
        System.out.println("Execution Time (milliseconds): " + durationMilli);
        System.out.println("Execution Time (seconds): " + (durationNano / 1_000_000_000.0));
    }

    public static void objTask() {
        var veh1 = new Vehicle();
        veh1.setName("mercedes");
        System.out.println("The Name of the vehicle (non-spring Context) is : " + veh1.getName());
        System.out.println("The Number is : " + veh1.number);
    }

    public static void contextTask() {
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
