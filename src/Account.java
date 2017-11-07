import org.openqa.selenium.By;

public class Account extends Registration {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();
public String password;
public void Account () {
    this.password = password;
}
//    Method that clicks My Personal Information link on My Account Page and edit all the available values

    public void editPersonalInfo () throws InterruptedException {
functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
        element.getMyPersonalInfo().click();
        fillPersonalInformation();
        element.getOldPassword().sendKeys(password);
        String newPassword = generator.generateRandomInt(15);
        element.getPassword().sendKeys(newPassword);
        element.getSaveChangesButton().click();

    }
}
