package table;

public class ReadTableData  {
    public void readDataTable extends CommonAPI(){

        String tableData = driver.findElement(By.cssSelector(".w3-table-all.translate tr:nth-child(5)")).getText();
     System.out.println(tableData);
    }


}
