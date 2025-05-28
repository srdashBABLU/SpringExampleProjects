package Example3.config;

import Example3.beans.Vehicle3;
import org.springframework.context.annotation.Bean;

public class ProjectConfig3 {
    // here we have the same 3 methods as before but let's add the custom name to them !
    // we are giving a name directly to the annotation !
    @Bean(name = "audi")
    Vehicle3 vehicle1(){
        var veh = new Vehicle3();
        veh.setName("Audi A8");
        return veh;  // returning the entire object !
    }

    // we are specifying the name in the value parameter here !
    // let's see what happens ! well it works !
    @Bean(value = "honda")
    Vehicle3 vehicle2(){
        var veh = new Vehicle3();
        // veh is an object of the vehicle class
        // which can access the properties of the class !
        veh.setName("Honda city"); // accessing the set name method from the class !
        return veh; // returning a string !
    }

    // we are passing the name string directly to the bean annotation !
    // lets see what happens !
    @Bean("ferrari")
    Vehicle3 vehicle3(){
        var veh = new Vehicle3();
        veh.setName("Ferrari");
        return veh; // returning the number ! from the class
    }


}
