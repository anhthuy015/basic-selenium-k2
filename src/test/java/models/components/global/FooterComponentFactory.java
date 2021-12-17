package models.components.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterComponentFactory {
    private final WebDriver driver;
    @FindBy(id = "page-footer")
    private  WebElement footerTextElem;
    @FindBy(css = "#page-footer a")
    private WebElement footerLinkTextElem;


    public FooterComponentFactory(WebDriver driver) {
        this.driver = driver;
    }

    public String footerTexts() {
        return footerTextElem.getText();
    }

    public String footerLink() {
        return footerLinkTextElem.getAttribute("href");
    }



}
