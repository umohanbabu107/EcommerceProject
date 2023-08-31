package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public static WebDriver driver;
    public LandingPage(WebDriver rDriver){
        this.driver = rDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(), 'Automation')]") WebElement landingPageHeading;


}
