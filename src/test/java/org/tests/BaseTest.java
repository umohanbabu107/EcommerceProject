package org.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver;
    public WebDriver driverSetup(String browserName){

        if (browserName == "chrome") {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName == "edge") {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        return driver;
    }

    @BeforeMethod
    public void driverInit(){
        driver = driverSetup("chrome");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public void Login(){

    }
}
