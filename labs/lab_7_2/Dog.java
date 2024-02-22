package labs.lab_7_2;

public class Dog extends Animal {
    private static int MAX_SPEED = 60;

    public Dog(String name) {
        super(name);
        super.speed = super.randomSpeed(MAX_SPEED);
    }
}
