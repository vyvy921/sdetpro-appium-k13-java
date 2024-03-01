package labs.lab_7_2_v2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static int MAX_SPEED = 100;

    public Tiger(String name) {
        super(name);
        this.maxSpeed = MAX_SPEED;
        this.runSpeed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }


}
