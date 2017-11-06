import org.openqa.selenium.By;

public class Registration {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();

    public void createAnAccount () throws InterruptedException {

//    Opens temporary e-mail page, waits to load and copies mail name to String.
        functions.openTemporaryMailPage();
        functions.waitUntilPageLoads(By.id("mail"));
        String temporaryEMail = element.getTemporaryEMail().getAttribute("value");

//    Methods that opens testing page and clicks on Sign In button on main page

        functions.openTestingPage();
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        element.getSignInLink().click();

//    Methods that opens temporary email page, copy email address and enter it to create an account

        functions.waitUntilPageLoads(By.id("email_create"));
        element.getEMail().sendKeys(temporaryEMail);
        element.getSubmitButton().click();

//    Methods that fills in all fields with proper values

        functions.waitUntilPageLoads(By.name("id_gender"));
        generator.randomClick(element.getGender());
        element.getName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        element.getPassword().sendKeys(generator.generateRandomPassword(15));
        generator.randomDropdownClick(element.getBirthDayList());
        generator.randomDropdownClick(element.getBirthMonthList());
        generator.randomDropdownClick(element.getBirthYearList());
//        generator.randomClick(element.getNewsletterCheckbox());
        element.getCompany().sendKeys(generator.generateRandomWord(25));
        element.getAdress().sendKeys(generator.generateRandomWord(25));
        element.getAdress2().sendKeys(generator.generateRandomWord(25));
        element.getCity().sendKeys(generator.generateRandomWord(15));
        element.getCountry().click();
        element.getUSA().click();
        generator.randomDropdownClick(element.getStateList());
        element.getPostcode().sendKeys(generator.generateRandomInt(10));
        element.getInfoTextarea().sendKeys(generator.generateRandomWord(50));
        element.getPhone().sendKeys(generator.generateRandomInt(10));
        element.getMobilePhone().sendKeys(generator.generateRandomInt(10));
        element.getAlias().sendKeys(temporaryEMail);
        element.getRegisterButton().click();
    }
}
