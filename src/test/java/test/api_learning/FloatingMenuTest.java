package test.api_learning;

import Driver.DriverFactory;
import models.pages.api_learning.FloatingMenuPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class FloatingMenuTest implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(baseUrl.concat(floatingPageSlug));

        try{
            FloatingMenuPage floatingMenuPage = new FloatingMenuPage(driver);
            floatingMenuPage.scrollToBottom();
            Thread.sleep(2000);
            floatingMenuPage.scrollToTop();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
