package Example5.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle5 {
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
        System.out.println("Printing hello from component vehicle5 bean");
    }
}
