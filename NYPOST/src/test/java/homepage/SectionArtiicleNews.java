package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SectionArtiicleNews extends CommonAPI {

    @Test
    public void getSectionNews(){
        driver.findElement(By.cssSelector("#page-nav")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector(".menu-main-manu li"));
        for (WebElement element: elements ){
            System.out.println(element.getText());
        }
    }
}
