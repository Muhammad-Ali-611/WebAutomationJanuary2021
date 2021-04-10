package table;

public class ReadTableData  {
    public void readDataTable(){

        String tableData = driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(5)")).getText();
     System.out.println(tableData);
    }


}
