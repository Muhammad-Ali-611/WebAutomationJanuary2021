package base;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    public String browserStackUserName = "Muhammad Ali";
    public String browserStackAccessKey = "StrCXDyLU9h2gRPppqKU";
    public String sauceLabUserName = "";
    public String sauceLabAccessKey = "";

    public static void navigateBack() {
    }

    public static void waitUntilClickAble(org.openqa.selenium.WebElement headLineNewsWebElement) {
    }

    public static void waitUnitVisible(org.openqa.selenium.WebElement headLineNewsWebElement) {
    }

    @ParameterNames({"useCloudEnv","envName","url","os_version,","browserName","browserVersion"})
    @BeforeMethod
    public void setUp(String useCloudEnv, String url) {
        //check if you want  to run test in local or in cloud
        if (useCloudEnv.equalsIgnoreCase("true")) {

            //getCloudDriver

        }else if (useCloudEnv.equalsIgnoreCase("false")){
            //get localDriver
            Object browserName = null;
            String os = null;
            getLocalDriver(os,browserName);
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }
    public WebDriver getLocalDriver(){
        System.setProperty("Webdriver.chrome.driver","Generic/driver/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }
    public WebDriver getCloudDriver(){

        return driver;
    }



    public WebDriver getLocalDriver(String browserName, Object name){
        if (browserName.equalsIgnoreCase("chrome")){
         if (OS.isVersion("OS X")){
             System.setProperty("Webdriver.chrome.driver","Generic/driver/chromedriver");
             driver = new ChromeDriver();
         }else if (OS.isVersion("Windows")){
             System.setProperty("Webdriver.chrome.driver","Generic/driver/chromedriver exe");
             driver = new ChromeDriver();
         }
        }else if (browserName.equalsIgnoreCase("Firefox")){
            if (OS.isVersion("OS X")){
                System.setProperty("Webdriver.chrome.driver","Generic/driver/geckodriver");
                driver = new FirefoxDriver();
            }else if (OS.isVersion("Windows")){
                System.setProperty("Webdriver.gecko.driver","Generic/driver/geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }else if (browserName.equalsIgnoreCase("i.e")){
            System.setProperty("Webdriver.i.e.driver","Generic/driver/Internetexplorerdriver . exe");
            driver = new InternetExplorerDriver();
        }else if (browserName.equalsIgnoreCase("safari")){
            System.setProperty("Webdriver.safari.driver","Generic/driver/safaridriver");
            driver = new SafariDriver();
        }
        return driver;
    }
    public WebDriver getCloudDriver(String envName, String OS,String os_version, String browserName, String browserVersion)throws MalformedURLException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browserVersion",browserVersion);
        cap.setCapability("OS",OS);
        if (envName.equalsIgnoreCase("BrowseStack")){
            driver = new RemoteWebDriver(new URL("http://"+browserStackUserName+":"+browserStackAccessKey+"@hub-cloud.browserStack.com/wd/hub"),cap);
            driver = new RemoteWebDriver(new URL("http://"+sauceLabUserName+":"+sauceLabAccessKey+"@ondemand.saucelabs.com:00/wd/hub"),cap);

        }
       return driver;

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
  /*  public List<String> getListOfText(String locator){
        List<WebElement> elements =driver.findElements(By.cssSelector(".nav-search-dropdown searchSelect"){
            List<String> ListOfText = new ArrayList<>();
            for (WebElement element : elements) {
                ListOfText.add(element.getText());
            }
            return ListOfText;*/
        }


