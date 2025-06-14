package Example6.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle6 {
    public int number = 281;
    private String name; // this is a private variable that cant be accessed outside the class !

    public String getName() { // it is used to get the private variable !
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name + " V2";
    }

    public void greet() {
        System.out.println("Printing hello from component vehicle6 bean");
    }

    // to use the @PostConstruct Annotation we have to include the library !
    // import jakarta.annotation.PostConstruct; in the file and
    /*
        <dependency>
            <groupId>jakarta.annotation</groupId>
            <artifactId>jakarta.annotation-api</artifactId>
            <version>3.0.0</version>
         </dependency>
     */

    @PostConstruct
    public void init() {
        this.name = "Ferrari";
    }
}
