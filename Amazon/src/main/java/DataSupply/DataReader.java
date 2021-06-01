package DataSupply;

import java.util.List;

public class DataReader {
    ConnectToSQqlDB connectToSQqlDB = new ConnectToSqlDB();

    public List<String> getItemListFromDB() throws Exception {
        List<String> list;
        list = connectToSQqlDB.readDataBase("ItemList", "item");
        return list;
    }


}
