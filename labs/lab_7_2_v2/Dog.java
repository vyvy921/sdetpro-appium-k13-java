package labs.lab_7_2_v2;

public class Dog extends Animal {
    private static int MAX_SPEED = 60;

    public Dog(String name) {
        super(name);
        super.maxSpeed = MAX_SPEED;
    }


}
