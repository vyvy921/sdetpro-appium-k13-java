package day_7;

public class RobotCatTest {

    public static void main(String[] args) {
        new RobotCat();
        //robotCat: user-defined data type
        RobotCat robotCat = new RobotCat("Mimi");
        System.out.println(robotCat.getName());

        robotCat.setName("Doremon");
        System.out.println(robotCat.getName());

        System.out.println(robotCat);
    }
}
