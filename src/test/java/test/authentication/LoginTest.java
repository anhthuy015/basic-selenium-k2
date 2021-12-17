package test.authentication;

import Driver.DriverFactory;
import models.pages.authentication.LoginPage;;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import url.Urls;

public class LoginTest implements Urls {

    WebDriver driver = DriverFactory.getChromeDriver();

    @BeforeTest
    public void beforeTest(){
        System.out.println("LoginTest"+"| BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("LoginTest"+"| BeforeClass");
    }

    @BeforeMethod
    public void openLoginPage(){
        System.out.println("Login Test"+"| BeforeMethod");
    }

//    @Test
//    public void loginWithCorrectCreds() {
//
//        String usernameStr = "tomsmith";
//        String passwordStr = "SuperSecretPassword!";
//
//        //Open target url
//        String loginUrl = baseUrl.concat(loginSlug);
//        driver.get(loginUrl);
//
//        try {
//            //Create new page model object
//            LoginPage loginPage = new LoginPage(driver);
//
//            loginPage
//                    .inputUsername(usernameStr)
//                    .inputPassword(passwordStr)
//                    .clickOnLoginBtn();
//
////            login(driver, usernameStr, passwordStr);
//
//            System.out.println(loginPage.footerComp().footerTexts());
//            System.out.println(loginPage.footerComp().footerLink());
//            Thread.sleep(2000);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            //driver.quit()
////            driver.quit();
//        }
//    }
        @Test
        public void loginWithIncorrectCreds() {

            String usernameStr = "tomsmith";
            String passwordStr = "SuperSecretPassword!";
            //Open target url
            String loginUrl = baseUrl.concat(loginSlug);
            driver.get(loginUrl);

            try {
                //Create new page model object
                LoginPage loginPage = new LoginPage(driver);

                loginPage
                        .inputUsername(usernameStr)
                        .inputPassword(passwordStr)
                        .clickOnLoginBtn();

                //Verification
                SoftAssert softAssert = new SoftAssert();
                String actualFooterTexts = loginPage.footerComp().footerTexts();
                String expectedFooterTexts = "Powered by Elemental Selenium.";
                String actualFooterLink = loginPage.footerComp().footerLink();
                String expectedFooterLink = "http://elementalselenium.com";

                boolean isFooterTextsCorrect = actualFooterTexts.equals(expectedFooterTexts);
                softAssert.assertTrue(isFooterTextsCorrect,"[ERR] Powered By Texts incorrect");
                softAssert.assertEquals(actualFooterLink,expectedFooterLink, "[ERR] Powered by link text incorrect");

                System.out.println("hjshfk");

                softAssert.assertAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //driver.quit()
                driver.quit();
            }
        }
    }