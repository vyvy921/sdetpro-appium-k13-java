package day_12.design_pattern;

public class Mute implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute.");
    }
}
