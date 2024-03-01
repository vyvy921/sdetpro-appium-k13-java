<<<<<<< HEAD
package labs.lab_7_2_v2_fixed;
=======
package labs.lab_7_2_v2;
>>>>>>> b7c6990a52bc29a7f90818a2f3ca11855c9d95bd

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;

    public Dog(String name) {
        super(name);
        this.maxSpeed = MAX_SPEED;
        this.runSpeed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }

}
