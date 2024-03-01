package labs.lab_7_2;

import java.security.SecureRandom;

public class Animal {
    protected int speed;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    //sevice method
    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    //support method
    public int randomSpeed(int speed) {

        return new SecureRandom().nextInt(speed);
    }

}
