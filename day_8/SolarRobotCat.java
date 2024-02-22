package day_8;

public class SolarRobotCat extends RobotCat {

    @Override
    public String charge() {

        return super.charge().concat("with solar");
    }

}
