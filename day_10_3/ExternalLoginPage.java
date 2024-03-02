package day_10_3;

public class ExternalLoginPage extends LoginPage{
    @Override
    public void inputUsername(String username) {
        System.out.println("External username");
    }

    @Override
    public void inputPassword(String password) {
        System.out.println("External password");
    }

    @Override
    public void clickOnLoginBtn() {
        System.out.println("External clicked");
    }
}
