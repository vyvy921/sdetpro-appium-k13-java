package lesson_6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashmapLearning {
    public static void main(String[] args) {
        //CRUD
        Map<Integer, String> emergencyList = new HashMap<>();
        Map<String, Map<String, String>> menuItemMap = new HashMap<>();

        // Adding a new entry into a map
        emergencyList.put(113, "Police Dept");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");
        System.out.println(emergencyList.get(116));

        //Read one value
        emergencyList.put(116, "Something else");
        System.out.println(emergencyList.get(116));
        System.out.println(emergencyList.get(117));

        //Update
        emergencyList.replace(116, "ABC");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "ABC", "XYZ");
        System.out.println(emergencyList.get(116));

        //Remove/Delete entry out of the map
        emergencyList.remove(116, "123");
        System.out.println(emergencyList.get(116));

        emergencyList.remove(116);
        System.out.println(emergencyList.get(116));

        //Adding into key again
        emergencyList.put(116, "Others");

        //loop over the map
        System.out.println("=====Loop over");
        printMapValues(emergencyList);


        //Loop over the entries, if the entry has value "Others" -> remove the map
        System.out.println("===== Loop over the entries, if the entry has value \"Others\" -> remove the map ====");
        Set<Integer> keys = emergencyList.keySet();
        for (Integer key : keys)
            if (emergencyList.get(key).equals("Others"))
                emergencyList.remove(key);

        printMapValues(emergencyList);

        //Loop over the entries, if the entry has value "Others" ->  update into "Something else"
        System.out.println("===== Loop over the entries, if the entry has value \"Others\" -> update into \"Something else\" ====");
        emergencyList.put(116, "Others");
        keys = emergencyList.keySet();
        for (Integer key : keys)
            if (emergencyList.get(key).equals("Others"))
                emergencyList.replace(key, "Something else");

        printMapValues(emergencyList);

        //PlayWithKeySet
        System.out.println("Play with keySet()");
        System.out.println(keys.size());
        System.out.println(keys.remove(113));
        System.out.println(keys.size());
        printMapValues(emergencyList);

    }

    private static void printMapValues(Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys)
            System.out.println(map.get(key));
    }

    /**
     * Given: Create a list
     * menuItemMap
     * loop over the Menu Item elements -> MenuItemList -> [element]
     * loop over the menuItemList
     *      elementText
     *      mouseHover/click onto the element
     *          create a map for subMenuMap  -> [subMenuItemText, subMenuItemHyperLink]
     *              menuItemMap.put(elementText, subMenuMap)
     */

    public static void m() {

        /**
         * Allow user to input a sentence
         * Count the words and group them
         * Ex: Hello, tui ten teo, ban co phai ten teo khong?
         * --> Output
         * Hello: 1
         * tui: 1
         * ten: 1
         * teo: 2
         *
         * 1. tach
         * 2. group sang key : value ~ text : count
         * */

    }


}
