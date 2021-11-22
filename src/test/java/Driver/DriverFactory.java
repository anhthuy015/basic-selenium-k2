package Driver;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class DriverFactory {

    // DriverFactory.getChromeDriver();

    public static WebDriver getChromeDriver(){
        //Current project dir
        String currentProjectDirLocation = System.getProperty("user.dir");
        // Specify ChromeDriver Options | Incognito
        String chromeDriverLocation = null;
        if(OS.isFamilyMac())
            chromeDriverLocation = currentProjectDirLocation + "/src/test/resources/Drivers/chromedriver";
        if(OS.isFamilyWindows())
            chromeDriverLocation = currentProjectDirLocation + "\\src\\test\\resources\\Drivers\\chromedriver.exe";
        if(chromeDriverLocation == null)
            throw new IllegalArgumentException("Cant detect current OS");

        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        //session initialization
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));


        return driver;

    }
}
