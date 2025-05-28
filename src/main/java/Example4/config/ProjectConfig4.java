package Example4.config;

import Example4.beans.Vehicle4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ProjectConfig4 {
    // here we have the same 3 methods as before but let's add the custom name to them !
    // we are giving a name directly to the annotation !
    @Primary
    @Bean(name = "audi")
    Vehicle4 vehicle1(){
        var veh = new Vehicle4();
        veh.setName("Audi A8");
        return veh;  // returning the entire object !
    }

    // we are specifying the name in the value parameter here !
    // let's see what happens ! well it works !
    @Bean(value = "honda")
    Vehicle4 vehicle2(){
        var veh = new Vehicle4();
        // veh is an object of the vehicle class
        // which can access the properties of the class !
        veh.setName("Honda city"); // accessing the set name method from the class !
        return veh; // returning a string !
    }

    // we are passing the name string directly to the bean annotation !
    // let's see what happens !
    @Bean("ferrari")
    Vehicle4 vehicle3(){
        var veh = new Vehicle4();
        veh.setName("Ferrari");
        return veh; // returning the number ! from the class
    }

    // here since we have the same 3 methods
    // i will get the same exception here !
    // so lets use @Primary to one of the bean!
}
