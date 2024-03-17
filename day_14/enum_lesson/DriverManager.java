package day_14.enum_lesson;

import static day_14.enum_lesson.Platform.IOS;

public class DriverManager {

    public static AppiumDriver getDriver(Platform targetPlatform) {


        //Check null or not before returning
        AppiumDriver appiumDriver = null;
        if (targetPlatform == null)
            throw new IllegalArgumentException("Platform should not be null");

        //Something get from env variable
        switch (targetPlatform) {
            case ANDROID:
                appiumDriver = new AndroidDriver();
                break;
            case IOS:
                appiumDriver = new IOSDriver();
                break;
        }
        return appiumDriver;
    }

    public static void main(String[] args) {

//        AppiumDriver driver = getDriver(null);
        AppiumDriver driver = getDriver(Platform.ANDROID);
        driver.createSession();
        driver.closeSession();


    }

}