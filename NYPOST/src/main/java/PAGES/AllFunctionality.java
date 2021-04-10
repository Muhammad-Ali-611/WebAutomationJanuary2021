package PAGES;

import datafetch.FetchTheSteps;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static javafx.beans.binding.Bindings.select;

public class AllFunctionality {

    LandingPage landingPage = null;
    SectionPage sectionPage = null;
    SearchPage searchPage = null;


    public void clickOnSectionMenu(WebDriver driver){
        landingPage = PageFactory.initElements(driver,LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionMenu(WebDriver driver) throws InterruptedException {
        clickOnSectionMenu(driver);
        sectionPage = PageFactory.initElements(driver,SectionPage.class);
        String headLineNews = sectionPage.goToBusinessPage(driver).getHeadLIneNews();
        System.out.println(headLineNews);
        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);
        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
    }
    public void runAllTheFeatureTest(WebDriver driver) throws  InterruptedException, IOException();
    FetchTheSteps fetchTheSteps = new FetchTheSteps();
    String [] featureSteps = fetchTheSteps.getDataFromExcelFile();
    for(int i = 1; i < featureSteps.length; i++){
        String driver = null;
        select(featureSteps[i],driver);
    }

    public void select(String featureNews, WebDriver driver)throws InterruptedException,IOException(d);
            switch(featureName){
        case "Section menu":
            sectionMenu(driver);
            break;
        case "search":
            searchPage(driver);
            break;
        default:
            throw new InvalidArgumentException("Invalid feature");

    }
}
