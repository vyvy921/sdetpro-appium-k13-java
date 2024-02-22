package day_8;

import java.util.Arrays;
import java.util.List;

public class RobotCatTest {

    public static void main(String[] args) {

        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();

        List<RobotCat> robotCatList = Arrays.asList(batteryRobotCat, solarRobotCat);
        RobotCatController.chargeRobots(robotCatList);



    }
}
