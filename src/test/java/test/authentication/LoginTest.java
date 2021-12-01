package test.authentication;

import Driver.DriverFactory;
import models.components.global.FooterComponent;
import models.pages.LoginPage;
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
            FooterComponent footerComponent = new FooterComponent(driver);
            WebElement footerTextElem = footerComponent.footerTextElem();
            loginPage
                    .inputUsername(usernameStr)
                    .inputPassword(passwordStr)
                    .clickOnLoginBtn();

//            login(driver, usernameStr, passwordStr);
            Thread.sleep(2000);
            System.out.println(footerTextElem.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit()
            driver.quit();
        }
    }
}
