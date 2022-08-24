package javaBase.com.lemon.day10;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;


public class Excel {
    public static void main(String[] args) throws IOException {
        //1.加载文件
        FileInputStream file =new FileInputStream("src/test/resources/api_testcases_futureloan_v1.xls");
        //2.poi解析文件
        Workbook sheets = WorkbookFactory.create(file);
        //3.指定sheet
        Sheet sheet = sheets.getSheet("register");
        //4.指定row
        Row row = sheet.getRow(7);
        //5.cell
        Cell cell = row.getCell(2);
        System.out.println(cell);
    }

}
