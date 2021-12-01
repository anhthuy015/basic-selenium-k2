package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

public class Lesson14_DropDown implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            //Navigate to the Hovers page
            driver.get(baseUrl.concat(dropdownOptionPage));

            //Target Dropdown
            Select select =  new Select(driver.findElement(By.id("dropdown")));

            select.selectByVisibleText("Option 1");
            Thread.sleep(1000);

            select.selectByIndex(2);
            Thread.sleep(1000);

            select.selectByValue("1");
            Thread.sleep(1000);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
