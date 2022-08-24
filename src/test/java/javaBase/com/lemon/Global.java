package javaBase.com.lemon;

import org.testng.annotations.BeforeSuite;

public class Global {

    @BeforeSuite
    public void global(){
        System.out.println("全局初始化操作");
    }
}
