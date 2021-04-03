package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchPage {
    @Test
    public void search(){
        WebDriver driver = null;
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchIconClickNEnterNewsNSubmit();
    }

    public void searchIconClickNEnterNewsNSubmit() {
    }

    public Object goToBusinessPage(WebDriver driver) {
    }
}


