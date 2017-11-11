import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new FirefoxDriver();

//        Delete later
        BrowserFunctions functions = new BrowserFunctions();
        ElementsLocations element = new ElementsLocations();
        Registration register = new Registration();
        EditProfile account = new EditProfile();
        Login login = new Login();
//
        register.createEMail();
        register.signIn();
        register.createAnAccount();
        register.fillPersonalInformation();
        register.fillBirthday();
        register.fillAdditionalOptions();
        register.fillAddressInfo();
        register.registrationClick();

//        login.logging();
    }
}
