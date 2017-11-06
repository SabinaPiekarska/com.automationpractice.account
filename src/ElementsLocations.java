import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsLocations extends BrowserFunctions {

//    Method with web element location from temporary email page

    public WebElement getTemporaryEMail() {
        return driver.findElement(By.id("mail"));
    }
//    Method with web element location from main page

    public WebElement getSignInLink(){
        return driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    }

//    Methods with web elements locations from authentication page

    public WebElement getEMail(){
        return driver.findElement(By.id("email_create"));
    }
    public WebElement getSubmitButton(){
        return driver.findElement(By.id("SubmitCreate"));
    }

//    Methods with web elements locations from create an account page

    public List<WebElement> getGender () {
        return driver.findElements(By.name("id_gender"));
    }
    public WebElement getName(){
        return driver.findElement(By.id("customer_firstname"));
    }
    public WebElement getLastName(){
        return driver.findElement(By.id("customer_lastname"));
    }
    public WebElement getPassword(){
        return driver.findElement(By.id("passwd"));
    }
    public WebElement getBirthDayList(){
        return driver.findElement(By.id("days"));
    }
    public WebElement getBirthMonthList(){
        return driver.findElement(By.id("months"));
    }
    public WebElement getBirthYearList(){
        return driver.findElement(By.id("years"));
    }
    public List<WebElement> getNewsletterCheckbox(){
//        return driver.findElement(By.id("newsletter"));
        return driver.findElements(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[7]"));
    }
    public WebElement getOfferCheckbox(){
        return driver.findElement(By.id("optin"));
    }
    public WebElement getCompany(){
        return driver.findElement(By.id("company"));
    }
    public WebElement getAdress(){
        return driver.findElement(By.id("address1"));
    }
    public WebElement getAdress2(){
        return driver.findElement(By.id("address2"));
    }
    public WebElement getCity(){
        return driver.findElement(By.id("city"));
    }
    public WebElement getStateList(){
        return driver.findElement(By.id("id_state"));
    }
    public WebElement getPostcode(){
        return driver.findElement(By.id("postcode"));
    }
    public WebElement getCountry(){
        return driver.findElement(By.id("id_country"));
    }
    public WebElement getUSA(){
        return driver.findElement(By.tagName("United States"));
    }

    public WebElement getInfoTextarea(){
        return driver.findElement(By.id("other"));
    }
    public WebElement getPhone(){
        return driver.findElement(By.id("phone"));
    }
    public WebElement getMobilePhone(){
        return driver.findElement(By.id("phone_mobile"));
    }
    public WebElement getAlias(){
        return driver.findElement(By.id("alias"));
    }
    public WebElement getRegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }
}
