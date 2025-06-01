package Example4.beans;

public class Vehicle4 {
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
}
