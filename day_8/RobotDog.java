package day_8;

public class RobotDog {

    //Class variable | SHARED value
//    public static int dogID = 0;
    public static int dogID = 0;
    private String name;

    /**Class members??
     * includes: Class variable and Class method <<< static | SHARED value
     *
     * Can we override class members?
     *  YES: if class variable
     *  NO: if class method
     *
     */


    public RobotDog() {
        dogID++;
    }

    public int getDogID() {
        //non-static can call to both static and non-static
        return dogID;
    }

    //Class method

    public static void doSth(){
        //static cannot call to non-static
//        System.out.println(name);
    }

    public void doAnotherThing(){};


}
