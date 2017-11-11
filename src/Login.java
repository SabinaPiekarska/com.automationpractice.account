public class Login extends Registration{

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    private String email = "abc@xyz.com";
    private String password = "Test@123";

//    Method that logs in

    public void loggingIn () throws InterruptedException {
        signIn();
        element.getRegisteredEMail().sendKeys(email);
        element.getPassword().sendKeys(password);
        element.getSubmitLoginButton().click();
    }

//    Method that logs out

    public void loggingOut () {
        element.getSignOutLink();
    }
}
