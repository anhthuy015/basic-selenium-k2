package test.authentication;

import Driver.DriverFactory;
import models.pages.authentication.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import url.Urls;

;

public class SignUpTest implements Urls {
    @BeforeTest
    public void beforeTest(){
        System.out.println("SignUpTest"+"| BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("SignUpTest"+"| BeforeClass");
    }

    @BeforeMethod
    public void openLoginPage(){
        System.out.println("SignUpTest"+"| BeforeMethod");
    }

    @Test
    public void signUpM01() {
        System.out.println("SignUpTest"+"| signUpM01");
    }

    @Test
    public void signUpM02() {
        System.out.println("SignUpTest"+"| signUpM02");
    }

}