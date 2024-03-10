package day_12.design_pattern;

public class BabyDuck extends Duck{
    public BabyDuck() {
        this.quackBehavior = new Sqeak();
    }
}
