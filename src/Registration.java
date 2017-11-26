import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();
    String temporaryEMail;

//    Method that clears the field first and then sends String to the web element
    public void editFields (WebElement element, String generator) {
        element.clear();
        element.sendKeys(generator);
    }

//    Method that opens temporary e-mail page, waits to load and copies mail name to String
    public void createEMail () throws InterruptedException {
        functions.openTemporaryMailPage();
        functions.waitUntilPageLoads(By.id("mail"));
        temporaryEMail = element.getTemporaryEMail().getAttribute("value");
    }

//    Method that opens testing page and clicks on Sign In button on main page
    public void signIn () throws InterruptedException {
        functions.openTestingPage();
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        element.getSignInLink().click();
    }

//    Methods that enters e mail to create an account
    public void createAnAccount () throws InterruptedException {
        functions.waitUntilPageLoads(By.id("email_create"));
        element.getEMail().sendKeys(temporaryEMail);
        element.getSubmitButton().click();
    }

//    Method that fills in personal information form fields with proper values
    public void fillPersonalInformation (String password) throws InterruptedException {
        functions.waitUntilPageLoads(By.name("id_gender"));
        generator.randomClick(element.getGender());
        element.getName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        element.getPassword().sendKeys(password);
    }

//    Method that fills in day, month and year fields
    public void fillBirthday () {
        generator.randomDropdownClick(element.getBirthDayList());
        generator.randomDropdownClick(element.getBirthMonthList());
        generator.randomDropdownClick(element.getBirthYearList());
    }

//    Method that ticks checkbox options
    public void fillAdditionalOptions () {
        generator.generateRandomBoolean(element.getNewsletterCheckbox());
        generator.generateRandomBoolean(element.getOfferCheckbox());
    }

//  Method that clears and than fills in address related fields
    public void fillAddressInfo () throws InterruptedException {
        editFields(element.getCompany(), generator.generateRandomWord(25));
        editFields(element.getAdress(), generator.generateRandomWord(25));
        editFields(element.getAdress2(), generator.generateRandomWord(25));
        editFields(element.getCity(), generator.generateRandomWord(15));
        generator.randomDropdownClick(element.getCountry());
//        generator.randomDropdownCountry(element.getCountry(),1);
        generator.randomDropdownClick(element.getStateList());
        editFields(element.getPostcode(), generator.generateRandomInt(5));
        editFields(element.getInfoTextarea(), generator.generateRandomWord(50));
        editFields(element.getPhone(), generator.generateRandomInt(10));
        editFields(element.getMobilePhone(), generator.generateRandomInt(10));
        editFields(element.getAlias(), generator.generateRandomWord(15));
    }

//    Method thath clicks on register button
    public void registrationClick () {
        element.getRegisterButton().click();
    }

}
