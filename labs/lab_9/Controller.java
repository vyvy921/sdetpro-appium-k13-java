package labs.lab_9;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void race(List<Animal> animalList) {

        //1. Filter Animals can run
        List<Animal> filteredList = new ArrayList<>();
        for (Animal animal : animalList)
            if (!animal.isFlyable())
                filteredList.add(animal);

        //2. Racing
        int max_speed = filteredList.get(0).getRunSpeed();
        Animal winner = filteredList.get(0);

        for (Animal animal : filteredList) {
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
