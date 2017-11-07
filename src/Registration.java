import org.openqa.selenium.By;

public class Registration {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();
    public static String password;
    String temporaryEMail;

    public void createAnAccount () throws InterruptedException {

//    Opens temporary e-mail page, waits to load and copies mail name to String.
        functions.openTemporaryMailPage();
        functions.waitUntilPageLoads(By.id("mail"));
        temporaryEMail = element.getTemporaryEMail().getAttribute("value");

//    Methods that opens testing page and clicks on Sign In button on main page

        functions.openTestingPage();
        functions.waitUntilPageLoads(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        element.getSignInLink().click();

//    Methods that opens temporary email page, copy email address and enter it to create an account

        functions.waitUntilPageLoads(By.id("email_create"));
        element.getEMail().sendKeys(temporaryEMail);
        element.getSubmitButton().click();
    }

    public void generatePassword () throws InterruptedException {
        functions.waitUntilPageLoads(By.name("id_gender"));
        generator.randomClick(element.getGender());
        element.getName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        password = generator.generateRandomPassword(15);
        element.getPassword().sendKeys(password);
    }
//    Methods that fills in all fields with proper values
public void fillPersonalInformation () {



        generator.randomDropdownClick(element.getBirthDayList());
        generator.randomDropdownClick(element.getBirthMonthList());
        generator.randomDropdownClick(element.getBirthYearList());
    }
//        generator.randomClick(element.getNewsletterCheckbox());
    public void fillAddressInfo () {
        element.getCompany().sendKeys(generator.generateRandomWord(25));
        element.getAdress().sendKeys(generator.generateRandomWord(25));
        element.getAdress2().sendKeys(generator.generateRandomWord(25));
        element.getCity().sendKeys(generator.generateRandomWord(15));
        generator.countrySelect(element.getCountry(), 1);
        generator.randomDropdownClick(element.getStateList());
        element.getPostcode().sendKeys(generator.generateRandomInt(5));
        element.getInfoTextarea().sendKeys(generator.generateRandomWord(50));
        element.getPhone().sendKeys(generator.generateRandomInt(10));
        element.getMobilePhone().sendKeys(generator.generateRandomInt(10));
        element.getAlias().clear();
        element.getAlias().sendKeys(temporaryEMail);
        element.getRegisterButton().click();
    }

}
