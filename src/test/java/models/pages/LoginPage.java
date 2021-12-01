package models.pages;

import models.components.global.FooterComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private static final By usernameSel = By.id("username");
    private static final By passwordSel = By.id("password");
    private static final By loginBtnSel = By.cssSelector("button[type='submit']");
    private final FooterComponent footerComp;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        footerComp = new FooterComponent(driver);
    }

    public WebElement usernameElem(){
        return driver.findElement(usernameSel);
    }

    public LoginPage inputUsername(String usernameStr){
        usernameElem().sendKeys(usernameStr);
        return this;
    }

    public WebElement passwordElem(){
        return driver.findElement(passwordSel);
    }

    public LoginPage inputPassword(String passwordStr){
        passwordElem().sendKeys(passwordStr);
        return this;
    }


    public WebElement loginBtnElem(){
        return driver.findElement(loginBtnSel);
    }

    public LoginPage clickOnLoginBtn(){
        loginBtnElem().click();
        return this;
    }

    public FooterComponent footerComp() {
        return this.footerComp;
    }

}
