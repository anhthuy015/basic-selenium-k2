package models.components.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterComponent {
    private final WebDriver driver;
    private static final By footerTextSel = By.id("page-footer");
    private static final By footerLinkTextSel = By.cssSelector("#page-footer a");

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement footerTextElem(){
        return driver.findElement(footerTextSel);
    }
    public String footerTexts() {
        return driver.findElement(footerTextSel).getText();
    }

    public String footerLink() {
        return driver.findElement(footerLinkTextSel).getAttribute("href");
    }



}
