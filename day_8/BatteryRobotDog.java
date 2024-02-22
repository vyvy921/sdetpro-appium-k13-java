package day_8;

public class BatteryRobotDog extends RobotDog {

    // static block | BAD design
    static {
        dogID = 10;
    }

    public static void doSth(){
//        super.doAnotherThing(); //Không thể override được
    }
}
