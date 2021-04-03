package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionPage {



    @FindBy(how = How.CSS,using = "#page-nav")
    public static WebElement sectionMenuWebElement;


    @FindBy(how = How.CSS,using = ".manu-main-manu li:nth-child(3) a")
    public static WebElement metroMenuWebElement;


    @FindBy(how = How.CSS,using = ".manu-main-manu li:nth-child(6) a")
    public static WebElement busineesMenuWebElement;

    public BusinessPage goToBusinessPage(WebDriver driver){
        busineesMenuWebElement.click();

        return new BusinessPage(driver);
    }
}
