package javaBase.lemon;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//dsadsa倒萨倒萨大大所多所123
public class TestNgDemo {
    @BeforeSuite
    @Test(dependsOnMethods = {"test2"})
    public  void test1(){
        System.out.println("test1...");
    }
    @AfterSuite
    @Test(alwaysRun = true)
    public  void test2(){
        System.out.println("test2...");
    }
    @Test(dependsOnMethods = {"test2","test1"},alwaysRun = true,groups = {"冒烟"},invocationCount = 100,invocationTimeOut=100,priority = 0,threadPoolSize=3)
    public  void test3(){
        System.out.println("test3...");
        System.out.println(Thread.currentThread().getName()+"test3...");
    }
}
