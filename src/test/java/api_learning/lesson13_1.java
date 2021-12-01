package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;
import java.util.List;

public class lesson13_1 implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            driver.get(baseUrl.concat(dynamicControlSlug));

            //wait Strategies
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            By btnSel = By.cssSelector("button");

            // When has one button on 1 page
//            WebElement btnElem = driver.findElement(btnSel);
//            btnElem.click();

            // When has more button on 1 page
            List<WebElement> btnElems = driver.findElements(btnSel);
            System.out.println("Size: " + btnElems.size());
            final int CHECKBOX_EXAMPLE_BTN_INDEX = 0;
            final int INPUT_EXAMPLE_BTN_INDEX = 1;
            WebElement checkBoxExampleBtnElem = btnElems.get(CHECKBOX_EXAMPLE_BTN_INDEX);
            WebElement inputBoxExampleBtnElem = btnElems.get(INPUT_EXAMPLE_BTN_INDEX);

            checkBoxExampleBtnElem.click();
            inputBoxExampleBtnElem.click();

            //Wait a little
            Thread.sleep(3000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
