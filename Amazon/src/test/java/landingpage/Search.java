package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.testng.annotations.Test;
import searchpage.SearchPage;

import java.util.List;

public class Search extends CommonAPI {
    @Test
    public void search() throws InterruptedException {
        List<String> itemList = SearchPage.getItemList();
        for (String item:itemList) {
            typeONCss("#twotabsearchtextbox", "laptop");
            Thread.sleep(2000);
            clearInputField("#twotabsearchtextbox");
        }
    }
}
