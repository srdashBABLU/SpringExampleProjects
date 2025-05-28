package Example2.main;

import Example2.beans.Vehicle2;
import Example2.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2Solution {
    public static void main(String[] args) {
        // since you saw that if we have more than one method of the same data type
        // then we can not get the Bean via Spring context ! or ioc container !
        // to fix that we need to specify exactly the same name of the bean !
        // here is how ! -->

        // we need the same context !
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        // but we are going to change the parameters of the getBean method !
        // var veh2 = context.getBean(Vehicle2.class);
        // the above one is the old method that we used !
        var veh3 = context.getBean("vehicle1",Vehicle2.class);
        // the class name will be the same !
        // we have specified the bean name !
        // so we will get the bean of the name vehicle1

        // let's print the bean object !
        System.out.println("Vehicle1 name from spring context is : " + veh3.getName());
        // we should get the bean name which is Audi A8
        // lets see what we got ! and it works !
        // let's do it with the other beans !

        // vehicle2 bean
        var veh4 = context.getBean("vehicle2",Vehicle2.class);
        System.out.println("Vehicle2 name from spring context is : " + veh4.getName());

        // vehicle3 bean
        var veh5 = context.getBean("vehicle3",Vehicle2.class);
        System.out.println("Vehicle3 name from spring context is : " + veh5.getName());

        // that's all and its working !
    }
}
