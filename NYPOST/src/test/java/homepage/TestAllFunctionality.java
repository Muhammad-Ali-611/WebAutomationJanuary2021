package homepage;

import PAGES.AllFunctionality;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAllFunctionality extends CommonAPI {

    @Test
    public void newsFeatures(){
        AllFunctionality featureNews = new PageFactory.initElements(driver,AllFunctionality.class);
        featureNews.sectionMenu(driver);
    }
}
