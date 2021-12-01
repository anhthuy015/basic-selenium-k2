package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;
import java.util.List;

public class lesson13 implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            driver.get(baseUrl.concat(dynamicControlSlug));

//            //Link text selector
//            By powerByLinkSel = By.partialLinkText("Elemental");
//            WebElement powerByLinkElem = driver.findElement(powerByLinkSel);
//
//            System.out.println("Link Text: " + powerByLinkElem.getText());
//            System.out.println("Power by Href: " + powerByLinkElem.getAttribute("href"));
//            System.out.println("LinkText target: " + powerByLinkElem.getAttribute("target"));
//
//            //Get current URL and Page title
//            System.out.println("Current URL: " + driver.getCurrentUrl());
//            System.out.println("Current page title: " + driver.getTitle());

            //wait Strategies
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            By checkBoxExampleBtnSel = By.cssSelector("#checkbox-example button");
            //Click on remove btn
            driver.findElement(checkBoxExampleBtnSel).click();

            //wait a little| Wait until progress bar is NOT displayed
            WebElement progressBar = driver.findElement(By.cssSelector("#loading"));
            //By.id("loading")
            //By.cssSelector("#loading")
            //By.cssSelector("[id = 'loading']")
            wait.until(ExpectedConditions.invisibilityOf(progressBar));//request->500ms

            //Click on add btn
            driver.findElement(checkBoxExampleBtnSel).click();
            wait.until(ExpectedConditions.invisibilityOf(progressBar));

            //Wait a little
            Thread.sleep(3000);

            //Example
            List<WebElement> menuItemElems = driver.findElements(By.id("tao lao"));
            if(menuItemElems.isEmpty())
                throw new RuntimeException("menu is empty");
            else {
                menuItemElems.forEach(menuItem -> {
                    System.out.println(menuItem.getText());
                });
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
