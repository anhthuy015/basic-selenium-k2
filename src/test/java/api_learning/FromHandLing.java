package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class FromHandLing implements Urls {

    private static final By usernameSel = By.id("username");
    private static final By passwordSel = By.id("password");
    private static final By loginBtnSel = By.cssSelector("[type='submit']");

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverFactory.getChromeDriver();


        //Open target url
        String loginUrl = baseUrl.concat(loginSlug);
        driver.get(loginUrl);

        try {
            String usernameStr = "tomsmith";
            String passwordStr = "SuperSecretPassword!";
            login(driver, usernameStr, passwordStr);
            Thread.sleep(2000);
        } catch (Exception ignored) {
        } finally {
            //driver.quit()
            driver.quit();
        }
    }

        private static void login (WebDriver driver, String username, String password){
            //Find username and password element
            WebElement usernameElem = driver.findElement(usernameSel);
            WebElement passwordElem = driver.findElement(passwordSel);
            WebElement loginBtnElem = driver.findElement(loginBtnSel);

            //API : sendKeys(String str);
            usernameElem.sendKeys(username);
            passwordElem.sendKeys(password);
            loginBtnElem.click();

        }

    }


