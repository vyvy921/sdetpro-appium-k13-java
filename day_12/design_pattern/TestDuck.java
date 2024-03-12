package day_12.design_pattern;

public class TestDuck {

    public static void main(String[] args) {

        Duck mallarDuck = new MallarDuck();
        Duck babyDuck = new BabyDuck();
        Duck decoy = new Decoy();

        mallarDuck.performQuack();
        mallarDuck.performFly();

        babyDuck.performQuack();
        babyDuck.performFly();

        decoy.performQuack();
        decoy.changeQuackBehavior(new Quack());
        decoy.performQuack();


//        Duck duck = new Duck();
//        duck.performQuack(); //Null pointer exception

    }
}
