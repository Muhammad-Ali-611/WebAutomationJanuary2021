package landingpage;

import base.CommonAPI;
import javafx.scene.chart.Chart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTile extends CommonAPI {


    @Test
    public void checkTitle(){
        String expectedTitle = "Amazon.com:Online Shopping for Electronics, Apparel, Computers,Books";
        Chart driver = null;
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
