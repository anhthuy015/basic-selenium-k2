package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class StartBrowser implements Urls {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();


        //Launch target test url
        driver.get(baseUrl);

        //driver.quit()
        driver.quit();
    }

}
