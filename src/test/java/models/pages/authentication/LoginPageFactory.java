package models.pages.authentication;

import models.components.global.FooterComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
    private final WebDriver driver;
    @FindBy(id = "username")
    private WebElement usernameElem;
    @FindBy(id = "password")
    private WebElement passwordElem;
    @FindBy(css = "button[type='submit']")
    private  WebElement loginBtnElem;

    private final FooterComponent footerComp;


    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        footerComp = new FooterComponent(driver);
    }

    public WebElement usernameElem(){
        return usernameElem;
    }

    public LoginPageFactory inputUsername(String usernameStr){
        usernameElem.sendKeys(usernameStr);
        return this;
    }

    public WebElement passwordElem(){
        return passwordElem;
    }

    public LoginPageFactory inputPassword(String passwordStr){
        passwordElem.sendKeys(passwordStr);
        return this;
    }


    public WebElement loginBtnElem(){
        return loginBtnElem;
    }

    public LoginPageFactory clickOnLoginBtn(){
        loginBtnElem.click();
        return this;
    }

    public FooterComponent footerComp() {
        return this.footerComp;
    }

}
