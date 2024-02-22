package day_8;

// Reuse concept
// Child class | subclass
// IS-A relationship 48:48
public class BatteryRobotCat extends RobotCat {
    public BatteryRobotCat() {

        super("name"," productionDate");
        super.yob = 2024;
    }

    @Override
    public String charge() {

        return super.charge().concat("with battery");
    }



}
