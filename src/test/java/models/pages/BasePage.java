package models.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.page.ScrollHandler;


public class BasePage {
    protected WebDriver driver;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    public void scrollToTop() {
        ScrollHandler.scrollToTop(javascriptExecutor);
    }

    public void scrollToBottom() {
        ScrollHandler.scrollToBottom(javascriptExecutor);
    }
}
