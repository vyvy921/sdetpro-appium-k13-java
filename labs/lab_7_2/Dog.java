package labs.lab_7_2;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;

    public Dog(String name) {
        super(name);
        this.speed = randomSpeed(MAX_SPEED + 1);
    }
}
