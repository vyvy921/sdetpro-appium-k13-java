package labs.lab_9;

import java.util.Arrays;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        Animal.Builder builder = new Animal.Builder();

        Animal tiger = builder
                .setName("Tiger")
                .setFlyable(false)
                .setRunSpeed(100)
                .build();

        Animal falcon = builder
                .setName("Falcon")
                .setFlyable(true)
                .setRunSpeed(1200)
                .build();

        Animal dog = builder
                .setName("Dog")
                .setFlyable(false)
                .setRunSpeed(60)
                .build();

        Animal snake = builder
                .setName("Snake")
                .setFlyable(false)
                .setRunSpeed(20)
                .build();

        Animal eagle = builder
                .setName("Eagle")
                .setFlyable(true)
                .setRunSpeed(660)
                .build();

        List<Animal> animalList = Arrays.asList(tiger, falcon, dog, snake, eagle);
        Controller.getWinner(animalList);

        System.out.println(animalList);

    }
}
