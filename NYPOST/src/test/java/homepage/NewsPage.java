package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class NewsPage extends CommonAPI {

    @Test
    public void home() {
        System.out.println(driver.getTitle());


    }
}
