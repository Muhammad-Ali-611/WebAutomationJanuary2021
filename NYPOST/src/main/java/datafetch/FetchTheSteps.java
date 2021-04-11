package datafetch;

import basesource.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();
    public String[][] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"NYPost/data/nyp-test-steps .xls";
        String[][] data = excelFile.fileReader1(path,0);

        return data;
    }

}
