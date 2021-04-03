package PAGES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    @FindBy(how = How.CSS,using = "#page-nav")
    public static  WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS,using = "#page-nav")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS,using = "#page-nav.icon-email")
    public static WebElement  signupWebElement;

    public void clickOnSectionMenu(){
        sectionNavBarWebElement.click();
    }
    public void ClickOnSearch(){
        searchWebElement.click();
    }
    public void signup(){
        searchWebElement.click();

    }

}
