package labs.lab_7_2;

import java.util.List;

public class ControllerAnimal {

    public static void race(List<Animal> animalList) {

        int max_speed = animalList.get(0).getSpeed();
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            if (animal.getSpeed() >= max_speed) {
                max_speed = animal.getSpeed();
                winner = animal;
            }
            System.out.printf("Animal name: %s has speed: %d \n", animal.getName(), animal.getSpeed());
        }

        System.out.println("--------========----------");
        System.out.printf("The winner is: %s with speed %d\n", winner.getName(), max_speed);
    }
}
