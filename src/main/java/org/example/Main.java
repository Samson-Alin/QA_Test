package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nila\\IdeaProjects\\QA_Automation_Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("");
    }
}