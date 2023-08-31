package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver rDriver) {
        this.driver = rDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "userPassword")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginButton;

    public void loginToApplication(String lUsername, String lPassword) {
        email.sendKeys(lUsername);
        password.sendKeys(lPassword);
        loginButton.click();
    }
}
