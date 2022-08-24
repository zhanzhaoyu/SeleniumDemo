package javaBase.lemon.day10;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.List;

public class Excel3 {
    public static void main(String[] args) throws Exception {
        //1.加载文件
        FileInputStream file =new FileInputStream("src/test/resources/api_testcases_futureloan_v1.xls");
        ImportParams params1=new ImportParams();
        params1.setSheetNum(1);
        params1.setStartSheetIndex(1);
        List<Object> list = ExcelImportUtil.importExcel(file, CaseInfo.class, params1);
        for(Object c:list){
            System.out.println(c);
//            // 获取以数组形式返回的 `HashMap` 的键
//            HashMap<Object, Object> hashMap={c:1};
//            String[] key = hashMap.keySet().toArray(new String[0]);
//
//            System.out.println(Arrays.toString(key));
            Object [] objects=list.toArray();
            for(int i=0;i<objects.length;i++){
                Object dd=objects[i];
                //System.out.println(objects[i]);
            }
        }
    }
}
