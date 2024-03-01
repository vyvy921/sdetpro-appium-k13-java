package labs.lab_7_2_v2_fixed;

import java.security.SecureRandom;

public class Horse extends Animal {

    private static final int MAX_SPEED = 75;

    public Horse(String name) {
        super(name);
        this.maxSpeed = MAX_SPEED;
        this.runSpeed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }


}
