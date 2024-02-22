package labs.lab_7_2;

public class Horse extends Animal {

    private static int MAX_SPEED = 75;

    public Horse(String name) {
        super(name);
        super.speed = super.randomSpeed(MAX_SPEED);
    }
}
