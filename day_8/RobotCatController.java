package day_8;

import java.util.List;

public class RobotCatController {

    // IS-A relationship processing
    // BatteryRobotCat is a RobotCat -> có hàm charge()
    // SolarRobotCat is a RobotCat -> có hàm charge()
    // HydroRobotCat is a RobotCat -> có hàm charge()
    public static void chargeRobots(List<RobotCat> robotCatList) {

        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }


}
