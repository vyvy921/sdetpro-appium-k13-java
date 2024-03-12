package day_12.design_pattern;

public class Duck {

    protected String name;

    protected IQuackBehavior quackBehavior;
    protected IFlyBehavior flyBehavior;

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    //Ability to change quackBehavior
    protected void changeQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
