package day_10_1;

import day_10_1.HouseWithBuilder;

public class TestBuilder {

    public static void main(String[] args) {

        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setColor("Green");
        builder.setWindows(9);

        HouseWithBuilder house = builder.build();

        System.out.println(house);

    }
}
