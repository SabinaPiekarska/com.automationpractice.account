import org.openqa.selenium.By;

public class SignOut{

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();

//    Method that logs out
    public void loggingOut () throws InterruptedException {
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        element.getSignOutButton().click();
    }
}