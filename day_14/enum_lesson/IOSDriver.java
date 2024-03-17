package day_14.enum_lesson;

public class IOSDriver extends AppiumDriver {

    @Override
    public void createSession() {
        System.out.println("Creating IOS session");
    }

    @Override
    public void closeSession() {
        System.out.println("Closing IOS session");
    }
}
