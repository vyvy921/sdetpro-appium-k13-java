package lesson_6;

import java.util.Arrays;

public class StringLearning2 {

    public static void main(String[] args) {
        //Immutable, replace and trim method
        String badWordContainer = "    bad,,, very bad sth else, bad!!    ";
        String filteredStr = badWordContainer.replace("bad", "***").replace(",", "").trim();
        System.out.println(filteredStr);
        System.out.println(badWordContainer); //Does not be changed

        //Substring, indexOf, split
        String url = "https://sdetpro.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));

        System.out.println(url.indexOf("com"));
        System.out.println(url.indexOf("z"));

        System.out.println(Arrays.toString(url.split("")));
        System.out.println(Arrays.toString(url.split(":")));

        //RegularExpression | Regex || regex101.com
        String cookingTimeStr = "200mins";
        String cookingTimeNumberStr = cookingTimeStr.replaceAll("[^0-9]", "");
        int cookingTime = Integer.parseInt(cookingTimeNumberStr);
        System.out.println(cookingTime + 2);

        //Concat | Concatenation
        String s1 = "Hello";
        String s2 = ", tui ten Teo";
        System.out.println(s1 + s2 + " how are you?");
        System.out.println(s1.concat(s2).concat(" how old are you?"));

        //StringBuilder


    }
}
