import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new FirefoxDriver();
        RandomGenerator generator = new RandomGenerator();
        Registration register = new Registration();
        EditProfile account = new EditProfile();
        SignOut signOut = new SignOut();
        String password = generator.generateRandomPassword(15);


        register.createEMail();
        register.signIn();
        register.createAnAccount();
        register.fillPersonalInformation(password);
        register.fillBirthday();
        register.fillAdditionalOptions();
        register.fillAddressInfo();
        register.registrationClick();
        account.editPersonalInfo(password);
        account.editAddress();
        signOut.loggingOut();
    }
}
