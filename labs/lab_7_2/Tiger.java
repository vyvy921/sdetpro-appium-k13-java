package labs.lab_7_2;

public class Tiger extends Animal {
    private static final int MAX_SPEED = 100;

    public Tiger(String name) {
        super(name);
        this.speed = randomSpeed(MAX_SPEED + 1);
    }
}
