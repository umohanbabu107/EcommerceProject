package org.tests;

import org.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void logInTest(){
        LoginPage lp = new LoginPage(driver);
        lp.logintoApplication(" dsalvotore@gmail.com", "Deamon@123");

    }

}
