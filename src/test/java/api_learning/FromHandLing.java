package api_learning;

import Driver.DriverFactory;

import org.openqa.selenium.WebDriver;

public class StartBrowser implements url {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();


        //Launch target test url
        driver.get(baseUrl);

        //driver.quit()
        driver.quit();
    }

}
