package Selenium;



import io.restassured.response.Response;
import org.testng.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class jieoukou {
    public  static void main (String[] args) {

        Response response =
                given().
                header("Content-Type", "application/json").
                body("{\"principal\":\"waiwai\",\"credentials\":\"lemon123456\",\"appType\":3,\"loginType\":0}").
                when().
                post("http://mall.lemonban.com:8107/login").

                then().
                log().body().extract().response();//打印响应报文，并保存值变量中

        int statusCode = response.getStatusCode();//获取状态码
        long time = response.getTime();//获取状态码
        response.getHeader("Content-Type");//获取响应头字段值
        Object o = response.jsonPath().get("access_token");
        Object nickName = response.jsonPath().get("nickName");
        System.out.println(o);
        Assert.assertEquals(nickName,"waiwai");

        Response response2 =
                given().
                        body("{\"principal\":\"waiwai\",\"credentials\":\"lemon123456\",\"appType\":3,\"loginType\":0}").
                when().
                        get("http://mall.lemonban.com:8107/search/searchProdPage?prodName=&categoryId=&sort=0&orderBy=0&current=1&isAllProdType=true&st=0&size=12").

                then().
                        log().all().extract().response();//打印响应报文，并保存值变量中
        Object o1 = response2.jsonPath().get("records.prodName[1]");
        Assert.assertEquals(o1,"帅气的狗头");
        System.out.println(o1);
    }
    public Response request(String metmod, String url, Map<String,Object> map, String params){
        Response response3 =null;
        if(metmod.equals("get")){
            response3 =
                    given().
                            headers(map).
                    when().
                            get(url+"?"+params).

                    then().
                            log().all().extract().response();//打印响应报文，并保存值变量中


        }else if(metmod.equals("post")){
            response3 =
            given().
                    body(params).
                    headers(map).
                    when().
                    get(url).

                    then().
                    log().all().extract().response();//打印响应报文，并保存值变量中


        }
        return  response3;}
}




