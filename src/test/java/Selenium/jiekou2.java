package Selenium;

import org.apache.commons.math3.ode.MainStateJacobianProvider;

import java.util.HashMap;
import java.util.Map;

public class jiekou2 {
    public static void main(String[] args) {
        Map<String ,Object> map = new HashMap<String ,Object>();
        jieoukou jieoukou = new jieoukou();
        jieoukou.request("get","http://mall.lemonban.com:8107/search/searchProdPage",map,
                "prodName=&categoryId=&sort=0&orderBy=0&current=1&isAllProdType=true&st=0&size=12");
    }
}
