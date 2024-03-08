package day_12;

import java.util.Arrays;

public class TestInterface {

    public static void main(String[] args) {

        Animal gaugau = new Animal();
        Human teo = new Human();

        IRaceAble controller = RaceController.getWinner(Arrays.asList(gaugau, teo));

        System.out.println(controller);
    }


}
