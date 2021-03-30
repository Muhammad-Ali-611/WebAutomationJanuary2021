package base;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @ParameterNames("url")
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("Webdriver.chrome.driver", "/Users/chma6/Links/WebAutomationJanuary2021/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void cleanUp() {
        driver.close();

    }
}