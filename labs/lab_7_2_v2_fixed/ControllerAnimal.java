package labs.lab_7_2_v2;

import java.util.List;

public class ControllerAnimal {

    public static void race(List<Animal> animalList) {

        int max_speed = animalList.get(0).getRunSpeed();
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            if (animal.getRunSpeed() >= max_speed) {
                max_speed = animal.getRunSpeed();
                winner = animal;
            }
            System.out.printf("Animal name: %s has speed: %d \n", animal.getName(), animal.getRunSpeed());
        }

        System.out.println("--------========----------");
        System.out.printf("The winner is: %s with speed %d\n\n", winner.getName(), max_speed);
    }
    public static void raceWithRandomSpeechForEachRun(List<Animal> animalList) {

        int max_speed = animalList.get(0).getRunSpeed();
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            animal.run();
            if (animal.getRunSpeed() >= max_speed) {
                max_speed = animal.getRunSpeed();
                winner = animal;
            }
            System.out.printf("Animal name: %s has speed: %d \n", animal.getName(), animal.getRunSpeed());
        }

        System.out.println("--------========----------");
        System.out.printf("The winner is: %s with speed %d\n\n", winner.getName(), max_speed);
    }
}
