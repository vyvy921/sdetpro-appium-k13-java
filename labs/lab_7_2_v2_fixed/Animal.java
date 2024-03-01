package labs.lab_7_2_v2;

import java.security.SecureRandom;

public class Animal {
    protected int runSpeed;
    protected int maxSpeed;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public String getName() {
        return name;
    }

    //support method
    public int run() {
        runSpeed = new SecureRandom().nextInt(maxSpeed);
        return runSpeed;
    }


}
