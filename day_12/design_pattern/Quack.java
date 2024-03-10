package day_12.design_pattern;

public class Quack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack !!!!");
    }
}
