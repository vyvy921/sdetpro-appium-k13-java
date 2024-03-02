package day_10_3;

public class InternalLoginPage extends LoginPage{
    @Override
    public void inputUsername(String username) {
        System.out.println("Internal username");
    }

    @Override
    public void inputPassword(String password) {
        System.out.println("Internal password");
    }

    @Override
    public void clickOnLoginBtn() {
        System.out.println("Internal clicked");
    }
}
