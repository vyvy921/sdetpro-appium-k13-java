package day_12;

public class Animal implements IRaceAble {

    private int speed;

    @Override
    public int speed() {
        this.speed = 10;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
