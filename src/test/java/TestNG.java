import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG {

    @Test(priority = 0)
    public void SignUpButton(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation1");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        //driver.findElement(By.cssSelector("choose-container.participant-container")).click();
        driver.close();
    }
    @Test(priority = 1)
    public void NotMatchingPasswords(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.close();
    }
    @Test()
    public void WrongInputFirstName(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin1");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.close();
    }
    @Test()
    public void WrongInputLastName(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin");
        driver.findElement(By.id("last-name")).sendKeys("Samson1");
        driver.findElement(By.id("email")).sendKeys("agrasrg@yahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.close();
    }
    @Test()
    public void WrongInputEmail(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.id("first-name")).sendKeys("Alin1");
        driver.findElement(By.id("last-name")).sendKeys("Samson");
        driver.findElement(By.id("email")).sendKeys("agrasrgyahoo.com");
        driver.findElement(By.id("sign-up-password-input")).sendKeys("Automation1");
        driver.findElement(By.id("sign-up-confirm-password-input")).sendKeys("Automation2");
        Select dropHeard = new Select(driver.findElement(By.id("sign-up-heard-input")));
        dropHeard.selectByIndex(2);
        driver.findElement(By.className("button-label")).click();
        driver.close();
    }
//    @Test()
//    public void SignUpFacebook(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("col.social-item.mr-3")).click();
//    }
//    @Test()
//    public void SignUpGoogle(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("col.social-item")).click();
//    }
//    @Test()
//    public void SignUpInstagram(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.id("socialmedia-account-instagram-button")).click();
//    }
}
