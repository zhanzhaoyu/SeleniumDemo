package javaBase.com.lemon.day10;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel2 {
    public static void main(String[] args) throws IOException {
        //1.加载文件
        FileInputStream file =new FileInputStream("src/test/resources/api_testcases_futureloan_v1.xls");
        //2.poi解析文件
        Workbook sheets = WorkbookFactory.create(file);
//        //3.指定sheet
//        Sheet sheet = sheets.getSheet("register");
//        //4.指定row
//        Row row = sheet.getRow(7);
//        //5.cell
//        Cell cell = row.getCell(2);
        for(Sheet sheet:sheets){
            for(Row row:sheet){
                for(Cell cell:row){
                    System.out.println(cell);
                    System.out.println("@@@@@@@@@@@@@@@@");
                }
                System.out.println("#######################################");
            }
            System.out.println("===============================================");
        }
        //1.加载文件
        FileOutputStream file2 =new FileOutputStream("src/test/resources/api_testcases_futureloan_v2.xls");

        //1：写入Excel参数配置
        ExportParams exportParams = new ExportParams();

        //2：设置sheet名称
        exportParams.setSheetName("登录");


    }
}
