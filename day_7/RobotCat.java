package day_7;

// Template
public class RobotCat {

    //property, attribute
    private String name;

    // Constructor
    public RobotCat() {
    }

    //Overloading constructor
    public RobotCat(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "RobotCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
