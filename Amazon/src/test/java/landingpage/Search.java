package landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.testng.annotations.Test;

public class Search extends  AmazonPage {
    @Test
    public void search() throws InterruptedException {
        By driver = null;
        driver.findElement((SearchContext) By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
    }
}
