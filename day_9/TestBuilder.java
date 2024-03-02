package day_9;

public class TestBuilder {

    public static void main(String[] args) {

        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setColor("Green");
        builder.setWindows(9);

        HouseWithBuilder house = builder.build();

        System.out.println(house);

    }
}
