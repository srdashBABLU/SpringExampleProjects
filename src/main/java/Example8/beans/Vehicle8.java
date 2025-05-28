package Example8.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Vehicle8 {
    private String name; // this is a private variable that cant be accessed outside the class !
    public int number = 281;

    public String getName() { // it is used to get the private variable !
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2(){
        return name + " V2";
    }

    public void greet(){
        System.out.println("Printing hello from component vehicle7 bean");
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

//    @PostConstruct
//    public void init(){
//        this.name = "Ferrari";
//    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying vehicle7 bean !");
    }
}
