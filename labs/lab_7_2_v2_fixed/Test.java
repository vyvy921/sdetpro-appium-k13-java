package labs.lab_7_2_v2;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Animal h1 = new Horse("Horse 1");
        Animal h2 = new Horse("Horse 2");
        Animal h3 = new Horse("Horse 3");

        Animal d1 = new Dog("Dog 1");
        Animal d2 = new Dog("Dog 2");
        Animal d3 = new Dog("Dog 3");

        Animal t1 = new Tiger("Tiger 1");
        Animal t2 = new Tiger("Tiger 2");

        List<Animal> animalList = Arrays.asList(h1, h2, h3, d1, d2, d3, t1, t2);

        System.out.println("Race");
        ControllerAnimal.race(animalList);
        ControllerAnimal.race(animalList);

        System.out.println("race With Random Speech For Each Run");
        ControllerAnimal.raceWithRandomSpeechForEachRun(animalList);
        ControllerAnimal.raceWithRandomSpeechForEachRun(animalList);
        ControllerAnimal.raceWithRandomSpeechForEachRun(animalList);

    }
}
