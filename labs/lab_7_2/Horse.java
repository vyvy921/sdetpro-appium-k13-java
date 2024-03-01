package labs.lab_7_2;

public class Horse extends Animal {

    private static final int MAX_SPEED = 75;

    public Horse(String name) {
        super(name);
        this.speed = randomSpeed(MAX_SPEED + 1);
    }
}
