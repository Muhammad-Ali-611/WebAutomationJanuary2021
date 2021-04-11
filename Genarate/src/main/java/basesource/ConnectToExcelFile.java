package basesource;

import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConnectToExcelFile {

    public static HSSFWorkbook wb = null;
    public static HSSFSheet sheet = null;
    public static Cell cell = null;
    public static FileOutputStream fio = null;
    public static int NumberOfRows, NumberOfCal, rowNumber;

    public String[][] fileReader1(String path, int sheetIndex)throws IOException {
        String[][] data = ();
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new HSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        NumberOfRows = sheet.getLastRowNum();
        NumberOfCal = sheet.getRow(0).getLastCellNum();
        data = new String[NumberOfRows + 1][];

        for (int i = 0; i < data.length; i ++){
            HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < NumberOfCal; j ++){
                HSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i] = cellData;
            }
            return data;
        }
    }
    public static String getCellValue(HSSFCell cell){
        Object value = null;

        int dataType = cell.getCellType();
        switch (dataType){
            case HSSFCell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOLLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }
}
