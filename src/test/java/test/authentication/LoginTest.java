package test.authentication;

import Driver.DriverFactory;
import models.components.global.FooterComponent;
import models.pages.authentication.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class LoginTest implements Urls{

    public static void main(String[] args) throws InterruptedException {

        String usernameStr = "tomsmith";
        String passwordStr = "SuperSecretPassword!";

        WebDriver driver = DriverFactory.getChromeDriver();
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

//            login(driver, usernameStr, passwordStr);

            System.out.println(loginPage.footerComp().footerTexts());
            System.out.println(loginPage.footerComp().footerLink());
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit()
            driver.quit();
        }
    }
}
