import org.openqa.selenium.By;

public class EditProfile extends Registration {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();

//    Method that clicks My Personal Information link on My EditProfile Page and edit all the available values
    public void editPersonalInfo (String oldPassword) throws InterruptedException {
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
        element.getMyPersonalInfo().click();
        editFields(element.getNewName(), generator.generateRandomWord(25));
        editFields(element.getNewLastname(), generator.generateRandomWord(25));
        fillBirthday();
        fillAdditionalOptions();
        element.getOldPassword().sendKeys(oldPassword);
        String newPassword = generator.generateRandomInt(15);
        element.getPassword().sendKeys(newPassword);
        element.getConfirmPassword().sendKeys(newPassword);
        element.getSaveChangesButton().click();
        element.getReturnToAccountButton().click();
    }

//    Method that clicks My Address link on My EditProfile Page and edit all the available values
    public void editAddress () throws InterruptedException {
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));
        element.getMyAddress().click();
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div/ul/li[9]/a[1]/span"));
        element.getUpdateButton().click();
        fillAddressInfo();
        element.getSaveUpdateButton().click();
    }
}