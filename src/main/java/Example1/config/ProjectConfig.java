package Example1.config;

import Example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this is where we store the spring beans !
// this class will work as an ioc container !
@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi A8");
        return veh;  // returning the entire object !
    }

    @Bean
    String vehicle2(){
        var veh = new Vehicle();
        // veh is an object of the vehicle class
        // which can access the properties of the class !
        veh.setName("Honda city"); // accessing the set name method from the class !
        return veh.getName(); // returning a string !
    }

    @Bean
    int vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh.number; // returning the number ! from the class
    }

}
