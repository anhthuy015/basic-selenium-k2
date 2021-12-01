package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class lesson14_JsAlerts implements Urls {
    private static final By jsAlertSel = By.cssSelector("[onclick=\"jsAlert()\"]");
    private static final By jsAlertConfirmSel = By.cssSelector("[onclick=\"jsConfirm()\"]");
    private static final By jsAlertPromSel = By.cssSelector("[onclick=\"jsPrompt()\"]");
    private static final By resultSel = By.cssSelector("#result");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            driver.get(baseUrl.concat(jsAlert));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement resultElem = driver.findElement(resultSel);

            //JS Alert |GetText -> confirm
            driver.findElement(jsAlertSel).click();
            Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsAlert.getText());
            jsAlert.accept();
            System.out.println(resultElem.getText());
            System.out.println("==============");

            //Js Alert confirm
            driver.findElement(jsAlertConfirmSel).click();
            Alert jsAlertConfirm = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsAlertConfirm.getText());
            jsAlertConfirm.dismiss();
            System.out.println(resultElem.getText());
            System.out.println("==============");

            //JS Alert Promt
            driver.findElement(jsAlertPromSel).click();
            Alert jsAlertProm = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(jsAlertProm.getText());
            jsAlertProm.sendKeys("This is my tesst..");
            jsAlertConfirm.accept();
            System.out.println(resultElem.getText());
            System.out.println("==============");



        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
