package PAGES;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionPage {


    @FindBy(how = How.CSS, using = "#page-nav")
    public static WebElement sectionMenuWebElement;


    @FindBy(how = How.CSS, using = ".manu-main-manu li:nth-child(3) a")
    public static WebElement metroMenuWebElement;


    @FindBy(how = How.CSS, using = ".manu-main-manu li:nth-child(6) a")
    public static WebElement busineesMenuWebElement;

    public WebElement getSectionMenuWebElement() {
        return sectionMenuWebElement;
    }

    public WebElement getMetroMenuWebElement() {
        return metroMenuWebElement;
    }

    public WebElement getBusineesMenuWebElement() {
        return busineesMenuWebElement;
    }

    public WebElement getEntertainmentMenuWebElement() {
        return getEntertainmentMenuWebElement();
    }

    public void clickOnSectionMenuTab() {
        getSectionMenuWebElement().click();
    }

    public MetroPage goToMetroPage(WebDriver driver) {
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }

    public BusinessPage goToBusinessPage(WebDriver driver) throws InterruptedException {
        try {
            getBusineesMenuWebElement().click();
        } catch (Exception ex) {
            CommonAPI.navigateBack();
            Thread.sleep(1000);
            getBusineesMenuWebElement();
        }
        return new BusinessPage(driver);

        public EntertainmentPage goToEntertainmentPage (WebDriver driver){
            getEntertainmentMenuWebElement().click();
            return new EntertainmentPage(driver);
        }
    }
}


