import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditProfile extends Registration {

    public EditProfile() {
        this.password = Registration.password;
    }
    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();

    public String password;

//    Method that clicks My Personal Information link on My EditProfile Page and edit all the available values

    public void editPersonalInfo () throws InterruptedException {
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
        element.getMyPersonalInfo().click();
        editFields(element.getNewName(), generator.generateRandomWord(25));
        editFields(element.getNewLastname(), generator.generateRandomWord(25));
        fillBirthday();
        fillAdditionalOptions();
        element.getOldPassword().sendKeys(password);
        String newPassword = generator.generateRandomInt(15);
        element.getPassword().sendKeys(newPassword);
        element.getConfirmPassword().sendKeys(newPassword);
        element.getSaveChangesButton().click();
    }

    public void editAddress () throws InterruptedException {
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));
        element.getMyAdress().click();
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div/ul/li[9]/a[1]/span"));
        element.getUpdateButton();
        fillAddressInfo();
        element.getSaveUpdateButton();

    }
}
