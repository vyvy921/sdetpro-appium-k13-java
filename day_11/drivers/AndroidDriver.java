package day_11.drivers;

public class AndroidDriver extends AppiumDriver {

    @Override
    public void createSession() {
        System.out.println("Creating Android session");
    }

    @Override
    public void closeSession() {
        System.out.println("Closing Android session");
    }
}
