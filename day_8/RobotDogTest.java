package day_8;

public class RobotDogTest {

    public static void main(String[] args) {
        RobotDog dog1 = new RobotDog();
        RobotDog dog2 = new RobotDog();

        System.out.println(dog1.getDogID());
        System.out.println(dog2.getDogID());

//        RobotDog.getDogID(); //Phai dc truy xuat thong qua object
        RobotDog.doSth(); //Class member, truy cap ko can Object
        System.out.println(RobotDog.dogID);
        System.out.println(dog1.dogID);

        //Override static variable
        BatteryRobotDog batteryRobotDog = new BatteryRobotDog();
        System.out.println(batteryRobotDog.getDogID());


    }
}
