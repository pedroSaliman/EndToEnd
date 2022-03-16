package Listners;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {


    @DataProvider(name = "Excel")
    public Object[][] getExcel() throws IOException {
        DataFormatter format = new DataFormatter();
        String path = "E:\\seleniumprojects\\EndToEnd\\src\\test\\java\\configration\\dataexcel.xlsx";
        FileInputStream fs = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sheet = wb.getSheet("sheet1");
        int rowcount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int colum = row.getLastCellNum();
        Object data[][] = new Object[rowcount - 1][colum];
        for (int i = 0; i < rowcount - 1; i++) {
            row = sheet.getRow(i + 1);
            for (int j = 0; j < colum; j++) {
                XSSFCell cell = row.getCell(j);
                data[i][j] = format.formatCellValue(cell);
            }
        }


        return data;
    }
}

