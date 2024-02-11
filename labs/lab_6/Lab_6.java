package labs.lab_6;

import java.util.*;

public class Lab_6 {
    public static void main(String[] args) {

        //Lab 6.1
        calculateTime("2hrs and 5 minutes");

        //Lab 6.2
        checkInputPassword("password123");

        //Lab 6.3
        filterNumber("pass0123p3420321100");

        //Lab 6.4
        checkUrl("https://google.com");

        //Lab 6.5
        groupAndCountWord("  Hello, tui   ten teo, ban co phai ten teo khong?  ");

    }


    public static void calculateTime(String strTime) {
        /**
         * LAB 6.1
         * Given input string: "2hrs and 5 minutes"
         * Please calculate how many minutes in total
         *
         * 1. Split into 2 parts: | and |
         *  -> 2hrs | 5 minutes
         *     [0]      [1]
         * 2. [0] -> find Digit of hrs
         *    [1] -> find Digit of minutes
         * */

        String[] timeSplited = strTime.split("and");
        //System.out.println(Arrays.toString(timeSplited));

        //String hourStr = timeSplited[0].trim();
        //String minuteStr = timeSplited[1].trim();

        String hourNumStr = timeSplited[0].replaceAll("[^0-9]", "").trim();
        String minuteNumStr = timeSplited[1].replaceAll("[^0-9]", "").trim();

        int hourNum = Integer.parseInt(hourNumStr);
        int minuteNum = Integer.parseInt(minuteNumStr);

        System.out.printf("Total time: %d (mins)\n", hourNum * 60 + minuteNum);
    }

    public static void checkInputPassword(String password) {
        /**
         * Lab 6.2
         * Allow user to input maximum 3 times
         * loop over: while(count <= 3)
         *      count++
         *      userInput.equal(password): True -> break
         * */

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 3) {
            count++;
            System.out.print("Enter your password: ");
            String userInputPassword = scanner.nextLine();
            if (userInputPassword.equals(password)) {
                System.out.println("Password is correct!!!");
                break;
            } else if (count == 3)
                System.out.println("Password is incorrect. Please try after 24 hrs");
            else System.out.printf("Password is incorrect. You have %d times to try again\n", 3 - count);
        }
    }

    public static void filterNumber(String string) {
        /**
         * Lab 6.3
         * Given a String, filter number only
         *
         * Loop over String
         *      convert: String.toCharArray
         *      if isDigit -> add into a arrayList
         * */

        List<Integer> listNumber = new ArrayList<>();
        for (char character : string.toCharArray())
            if (Character.isDigit(character))
                listNumber.add(Integer.valueOf(String.valueOf(character)));

        System.out.println("List number only: ");
        for (Integer number : listNumber)
            System.out.printf("%d\t", number);

        System.out.println();
    }

    public static void checkUrl(String url) {
        /**LAB 6.4
         * Check http OR https; domain name, .com OR .net
         *
         * 1. Split with given regex ":" "."
         *      -> output: 2 String[]
         * 2. Then: get index 0, 1 and print
         */

        String[] protocol = url.split(":");
        String[] topLevelDomain = url.split("\\.");
        String[] secondLevelDomain = url.split("://");

        System.out.println("The URL ".concat(url).concat(" has: "));
        System.out.print("\t+Protocol: ");
        System.out.println(protocol[0]);
        System.out.print("\t+Domain name: ");
        System.out.println("".concat(secondLevelDomain[secondLevelDomain.length - 1]));
        System.out.print("\t+Top level Domain: ");
        System.out.println(".".concat(topLevelDomain[topLevelDomain.length - 1]));
    }

    public static void groupAndCountWord(String string) {

        /**
         * Idea:
         *         tui la teo ne tui la tui
         * Loop    |   |   |  |              loop over to create key. If key_unique=true -> create, else replace
         *
         * Steps:
         * 1. Split the String -> output: String Array
         * 2. Remove special character
         *      loop over String Array -> using regex to replace all
         * 3. Loop over String Array to create key
         *      if key is not in hashmap -> hashmap.put
         *      else if key is in hashmap -> hashmap.replace
         *
         * */

        Map<String, Integer> stringHashMap = new HashMap<>();
        String[] stringArrAfterSpliting;

        //1. Split the String -> output: String Array
        stringArrAfterSpliting = string.split(" ");

        //2. Remove special character
        for (int index = 0; index < stringArrAfterSpliting.length; index++) {
            stringArrAfterSpliting[index] = stringArrAfterSpliting[index].replaceAll("\\W", "");
        }

        //3. Loop over String Array to create a new key or replace value of an old key
        for (String strValue : stringArrAfterSpliting)
            if (!strValue.isBlank() && !stringHashMap.containsKey(strValue))
                stringHashMap.put(strValue.trim(), 1);
            else if (!strValue.isBlank() && stringHashMap.containsKey(strValue))
                stringHashMap.replace(strValue, stringHashMap.get(strValue) + 1);

        System.out.println(stringHashMap);

    }
}
