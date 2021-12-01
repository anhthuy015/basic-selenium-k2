package api_learning;

import Driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class lesson13_2 implements Urls {

    private static final By inputFieldSel = By.cssSelector("input");
    private static final By btnSel = By.cssSelector("button");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            driver.get(baseUrl.concat(dynamicControlSlug));

            //1st Form | CHECKBOX example form
            By checkboxExampleFormSel = By.cssSelector("#checkbox-example");
            WebElement checkboxExampleFormElem = driver.findElement(checkboxExampleFormSel);
            WebElement checkboxOption = checkboxExampleFormElem.findElement(inputFieldSel);
            WebElement removeBtnElem = checkboxExampleFormElem.findElement(btnSel);

            if(!checkboxOption.isSelected())
                checkboxOption.click();
            removeBtnElem.click();

            //2nd Form | INPUT example form
            By inputExampleFormSel = By.cssSelector("#input-example");
            WebElement inputExampleFormElem = driver.findElement(inputExampleFormSel);
            WebElement inputExampleInputFieldElem = inputExampleFormElem.findElement(inputFieldSel);
            WebElement inputExampleBtnElem = inputExampleFormElem.findElement(btnSel);
//            System.out.println(inputExampleInputFieldElem.isEnabled());
//            System.out.println(inputExampleBtnElem.getText());

            if(!inputExampleInputFieldElem.isEnabled())
                inputExampleBtnElem.click();


            //Wait a little
            Thread.sleep(3000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
