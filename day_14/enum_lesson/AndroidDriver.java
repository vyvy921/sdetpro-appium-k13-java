package day_14.enum_lesson;

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
