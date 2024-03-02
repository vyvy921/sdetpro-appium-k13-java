package day_10_3;

public class TestLoginPage {
    public static void main(String[] args) {
        InternalLoginPage internalLoginPage = new InternalLoginPage();
        ExternalLoginPage externalLoginPage = new ExternalLoginPage();

        LoginFlow loginFlow = new LoginFlow("teo", "123");
        loginFlow.loginPageWithCreds(internalLoginPage);
        loginFlow.loginPageWithCreds(externalLoginPage);
    }
}
