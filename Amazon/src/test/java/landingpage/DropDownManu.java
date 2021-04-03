package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;

public class DropDownManu extends CommonAPI {

    @Test
    public void dropDownMenu(){
        List<String> manuList = getListOfText(".nav-search-dropdown searchSelect");
            for (String value :manuList){
                System.out.println(value);
                
            }
 

        }
    }


