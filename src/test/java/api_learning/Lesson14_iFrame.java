package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lesson14_iFrame implements Urls {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get(baseUrl.concat(iFrame));

            //Switch to Iframe
            driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));

            //Clear default text then input new ones
            WebElement editorInputElem = driver.findElement(By.className("mce-content-body"));
            editorInputElem.clear();

            Thread.sleep(2000);

            editorInputElem.sendKeys("hsfjksdhfj sdfhksdhf");

            Thread.sleep(2000);



            //Switch back to default frame
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}
