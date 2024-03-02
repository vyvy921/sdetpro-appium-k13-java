package day_9;

import day_9.HouseWithBuilder_MethodChains.*;

public class TestBuilder_MethodChains {

    public static void main(String[] args) {
        // method chaining/
        Builder builder = new Builder();
        HouseWithBuilder_MethodChains house = builder
                .setColor("Yellow")
                .setMainDoors(5)
                .setTopRoof("Pink")
                .setWindows(6)
                .build();

        System.out.println(house);
    }
}
