import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/*
    Test suite for Politrip SignUP
    - Used browser: Google Chrome
    - Programming language: Java
    - Test framework: testNG
    - Web automation libraries: Selenium

*/
public class Check_SignUP_Chrome {

    @Test(priority = 0)
    public void SignUpButton(){
        // WebDriver setup

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // SignUp button test

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasfrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.close();
    }
    @Test()
    public void NotMatchingPasswords(){
        // WebDriver setup

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if SignUp button is disabled when passwords don't match

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasfrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        WebElement signUpButton = driver.findElement(By.className("button-label"));
        boolean actualValue = signUpButton.isEnabled();
        Assert.assertTrue(actualValue);
        driver.close();

    }
    @Test()
    public void WrongInputFirstName(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if SignUp button is disabled when "First Name" field has invalid input

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin1");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrafsrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        WebElement signUpButton = driver.findElement(By.className("button-label"));
        boolean actualValue = !signUpButton.isEnabled();
        Assert.assertTrue(actualValue);
        driver.close();
    }
    @Test()
    public void WrongInputLastName(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if SignUp button is disabled when "Last Name" field has invalid input

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson1");
        driver.findElement(By.id("email")).sendKeys("agrafrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        WebElement signUpButton = driver.findElement(By.className("button-label"));
        boolean actualValue = !signUpButton.isEnabled();
        Assert.assertTrue(actualValue);
        driver.close();
    }
    @Test()
    public void WrongInputEmail(){
        // WebDriver setup

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if SignUp button is disabled when "Email" field has invalid input

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin1");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasfrgyahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        WebElement signUpButton = driver.findElement(By.className("button-label"));
        boolean actualValue = !signUpButton.isEnabled();
        Assert.assertTrue(actualValue);
        driver.close();
    }
    @Test()
    public void UserAlreadyRegistered(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if SignUp button is disabled when Email is already registered

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("alinsamson11@gmail.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        WebElement alreadyRegistered = driver.findElement(By.id("sign-up-error-div"));
        boolean actualValue = alreadyRegistered.isDisplayed();
        Assert.assertTrue(actualValue);
        //driver.findElement(By.cssSelector("choose-container.participant-container")).click();
        driver.close();
    }
    @Test()
    public void TermsUnchecked(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        /*
        Verifying if "Participant" and "Organizer" containers are disabled
        when "Processing personal data" checkbox is unselected
        */

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrfasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.findElement(By.xpath("//*[@id=\"mail-subscription-label\"]/span/span/i")).click();
        WebElement participantContainer = driver.findElement(By.xpath("//*[@id=\"qa_signup-participant\"]"));
        boolean actualValue1 = !participantContainer.isEnabled();
        WebElement organizerContainer = driver.findElement(By.xpath("//*[@id=\"qa_signup-organizer\"]"));
        boolean actualValue2 = !organizerContainer.isEnabled();
        Assert.assertTrue(actualValue2 && actualValue1);

        //driver.findElement(By.cssSelector("choose-container.participant-container")).click();
        driver.close();
    }
    @Test()
    public void SignUpParticipant(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if "Participant" container can be clicked

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrfasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.findElement(By.xpath("//*[@id=\"qa_signup-participant\"]")).click();
        driver.close();
    }
    @Test()
    public void SignUpOrganizer(){
        // WebDriver setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // Verifying if "Organizer" container can be clicked

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrfasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.findElement(By.xpath("//*[@id=\"qa_signup-organizer\"]")).click();
        driver.close();
    }

//    @Test()
//    public void SignUpFacebook(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.get("https://politrip.com/account/sign-up");
//        driver.findElement(By.xpath("//*[@id="socialmedia-account-component-div"]/div[1]/div[1]")).click();
//    }
//    @Test()
//    public void SignUpGoogle(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.get("https://politrip.com/account/sign-up");
//        driver.findElement(By.xpath("//*[@id="socialmedia-account-component-div"]/div[1]/div[2]")).click();
//    }
//    @Test()
//    public void SignUpInstagram(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.get("https://politrip.com/account/sign-up");
//        driver.findElement(By.xpath("*[@id="socialmedia-account-instagram-button"]")).click();
//       }
//    @Test()
//    public void SignUpInstagram(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.get("https://politrip.com/account/sign-up");
//        driver.findElement(By.xpath("//*[@id="socialmedia-account-component-div"]/div[2]/div")).click();
//       }
}
