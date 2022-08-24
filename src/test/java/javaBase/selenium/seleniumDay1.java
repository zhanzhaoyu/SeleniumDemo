package javaBase.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumDay1 {
    public static void main(String[] args) {
        //openChrome();
        //openFirefox();
        //openEdge();
//        RemoteWebDriver driver = openBrowser("edge");
//        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
        //1、打开浏览器（chrome）--全新的浏览器，里面没有任何用户数据
        //告诉代码指定驱动的路径
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //2、访问网址
        driver.get("https://www.baidu.com");
        //3、将浏览器窗口最大化
        //链式调用
        driver.manage().window().maximize();
        //4、关闭浏览器
        driver.quit();
    }

//    public static RemoteWebDriver openBrowser(String browserName){
//        //判断
//        if("chrome".equalsIgnoreCase(browserName)){
//            //打开chrome浏览器
//            System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
//            return new ChromeDriver();
//        }else if("firefox".equalsIgnoreCase(browserName)){
//            //打开firefox浏览器
//            System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
//            return new FirefoxDriver();
//        }else if("edge".equalsIgnoreCase(browserName)){
//            //打开edge浏览器
//            System.setProperty("webdriver.edge.driver","src\\test\\resources\\msedgedriver.exe");
//            return new EdgeDriver();
//        }else {
//            System.out.println("浏览器暂时不支持或者浏览器名有误");
//            return null;
//        }
//    }
    public static void openEdge(){
        //1、打开浏览器（edge）
        System.setProperty("webdriver.edge.driver","src\\test\\resources\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
    }
//    public static void openFirefox(){
//        //1、打开浏览器（firefox）
//        //指定firefox驱动的路径
//        System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
//    }

//    public static void openChrome(){
//        //1、打开浏览器（chrome）--全新的浏览器，里面没有任何用户数据
//        //告诉代码指定驱动的路径
//        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        //2、访问网址
//        driver.get("https://www.baidu.com");
//        //3、将浏览器窗口最大化
//        //链式调用
//        driver.manage().window().maximize();
//        //4、关闭浏览器
//        driver.quit();
//    }
}
