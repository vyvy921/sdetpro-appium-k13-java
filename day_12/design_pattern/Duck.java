package day_12.design_pattern;

public class Duck {

    protected IQuackBehavior quackBehavior;
    protected IFlyBehavior flyBehavior;

    protected void performQuack() {
        quackBehavior.quack();
    }

}
