package labs.lab_7_2;

public class Tiger extends Animal {
    private static int MAX_SPEED = 100;

    public Tiger(String name) {
        super(name);
        super.speed = super.randomSpeed(MAX_SPEED);
    }
}
