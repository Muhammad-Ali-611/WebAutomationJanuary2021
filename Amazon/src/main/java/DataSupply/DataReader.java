package DataSupply;

import java.util.List;

public class DataReader<ConnectToSQqlDB> {

    ConnectToSQqlDB connectToSQqlDB = new ConnectToSqlDB();

    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSQqlDB.readDataBase("ItemList", "item");
        return list;
    }

    }
