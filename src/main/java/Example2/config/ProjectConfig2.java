package Example2.config;

import Example2.beans.Vehicle2;
import org.springframework.context.annotation.Bean;

public class ProjectConfig2 {
    @Bean
    Vehicle2 vehicle1(){
        var veh = new Vehicle2();
        veh.setName("Audi A8");
        return veh;  // returning the entire object !
    }

    @Bean
    Vehicle2 vehicle2(){
        var veh = new Vehicle2();
        // veh is an object of the vehicle class
        // which can access the properties of the class !
        veh.setName("Honda city"); // accessing the set name method from the class !
        return veh; // returning a string !
    }

    @Bean
    Vehicle2 vehicle3(){
        var veh = new Vehicle2();
        veh.setName("Ferrari");
        return veh; // returning the number ! from the class
    }

    // as you can see above we have three functions  of same data type ! vehicle1, vehicle2, vehicle3
    // and we are requesting the spring ioc container to give us the function that has the data type Vehicle2
    // in this case all three of them has the same data type !
    // so it will throw an error !
    // NoSuchUniqueBeanDefinitionException
    // as you can see ->
}
