package com.vadidra.learn.selenium.orangehrm;

import com.vadidra.learn.selenium.orangehrm.pom.Browser;
import com.vadidra.learn.selenium.orangehrm.pom.LoginPage;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @SuppressWarnings("deprecation")
    @Before
    public void setUp(){

        //driver = new ChromeDriver();
        driver = Browser.getDriver("chrome");
    }

    @After
    public void tearDown(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    public void testLogin(){

        LoginPage loginPage;

        try {


            loginPage = new LoginPage(driver);
            loginPage.navigateTo();
            loginPage.login();
            Assert.assertTrue(loginPage.isAt());

        }
        catch (Exception e) {
            Assert.fail("Exception " + e);
        }



    }

}
