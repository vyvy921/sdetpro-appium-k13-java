package day_7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {

    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();

        RobotCat meomeo = new RobotCat("MeoMeo");
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

        //Change the second's meomeo's name

        int SECOND_MEOMEO_INDEX = 1;
        robotCatList.get(SECOND_MEOMEO_INDEX).setName("MiMi");

        System.out.println(robotCatList);

    }
}
