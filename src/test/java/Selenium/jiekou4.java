package Selenium;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.alibaba.fastjson.JSONObject;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

public class jiekou4 {
    @Test
    public void login(){
        //读取Excel中的数据
        File file = new File("src/test/resources/接口测试用例模板.xls");
        //读取Excel中的参数
        ImportParams params = new ImportParams();
        //读取Excel的sheet
        params.setStartSheetIndex(0);
        List<jiekou0401> objects = ExcelImportUtil.importExcel(file,jiekou0401.class,params);
        System.out.println(objects);
        //heard的json转换成map
        Map<String,Object> header = JSONObject.parseObject(objects.get(0).getHeafer());
        //发起接口请求
        jieoukou jieoukou = new jieoukou();
        Response res1=jieoukou.request(objects.get(0).getMethod(),objects.get(0).getUrl(),header,objects.get(0).getParams());
        //断言
//        Object nickName = res1.jsonPath().get("nickName");
//        System.out.println(nickName);
//        Assert.assertEquals(res1.jsonPath().get("nickName"),"waiwai");
//        Assert.assertEquals(nickName,"waiwai");


    }
}
