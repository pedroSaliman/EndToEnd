package tests;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Dataprovider {
//    public Dataprovider() throws FileNotFoundException {
//    }
//
//    @org.testng.annotations.DataProvider(name = "datadriven")
//        public Object[][] dataprov() {
//            Object[][] data = {{"w@gmail.com", "123456789"}, {"putin@gmail.com", "123456789"}, {"lka@gmail.com", "123456789"}};
//            return data;
//        }




    String path="E:\\seleniumprojects\\EndToEnd\\src\\test\\java\\configration\\data.xlsx";
    FileInputStream fs = new FileInputStream(path);
XSSFWorkbook wb = new XSSFWorkbook();
XSSFSheet sheet = wb.getSheet("sheet");
int rowcount = sheet.getPhysicalNumberOfRows();

    public Dataprovider() throws FileNotFoundException {
    }
}
