package landingpage;

import DataSupply.DataReader;
import base.CommonAPI;
import org.testng.annotations.Test;
import java.util.List;

public class TestSearch extends CommonAPI {
    DataReader dataReader = new DataReader();
    @Test
    public void Search() throws Exception {
        List<String> list = dataReader.getItemListFromDB();
        for (String item:list){
            String items = null;
            typeONCss("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }
}
