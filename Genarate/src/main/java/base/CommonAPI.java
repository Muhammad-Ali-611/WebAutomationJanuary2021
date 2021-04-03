package base;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    private Object WebElement;

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

    //common API
    public void typeONCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clearInputField(String locator){
       driver.findElement(By.cssSelector(locator)).clear();

    }
    public List<String> getListOfText(String locator){
        List<WebElement> elements =driver.findElements(By.cssSelector(".nav-search-dropdown searchSelect"){
            List<String> ListOfText = new ArrayList<>();
            for (WebElement Element : WebElement) {
                ListOfText.add(Element.getText());
            }
            return ListOfText;
        }

    }
}