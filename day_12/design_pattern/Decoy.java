package day_12.design_pattern;

public class Decoy extends Duck {
    public Decoy() {
        this.quackBehavior = new Mute();
    }

    //Ability to change quackBehavior

}
