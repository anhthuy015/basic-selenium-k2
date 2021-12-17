package utils.page;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollHandler {
    public static void scrollToTop(JavascriptExecutor javascriptExecutor){
        final String jsSnippet = "window.scrollTo(0,0)" ;
        javascriptExecutor.executeScript(jsSnippet);
    }

    public static void scrollToBottom(JavascriptExecutor javascriptExecutor){
        final String jsSnippet = "window.scrollTo(0,document.body.scrollHeight)" ;
        javascriptExecutor.executeScript(jsSnippet);
    }
}
