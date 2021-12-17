package models.pages.api_learning;

import models.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPage extends BasePage {
    private JavascriptExecutor javascriptExecutor;
    private static final By headingSel = By.tagName("h3");
    private static final By menuSel = By.id("menu");

    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

}
