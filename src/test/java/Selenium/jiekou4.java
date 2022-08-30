package Selenium;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class jiekou4 {
    @Test
    public void login(){
        File file = new File("src/test/resources/接口测试用例模板.xls");
        List<Object> objects = ExcelImportUtil.importExcel(file,);
    }
}
