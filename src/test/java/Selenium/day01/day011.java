package Selenium.day01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class day011 {
    public static void main(String[] args) {
        //1.打开浏览器
        RemoteWebDriver driver=driver("edge");
        //2、访问网址
        driver.get("https://v.qq.com/");
        //3、将浏览器窗口最大化
        //链式调用
        driver.manage().window().maximize();
        //4、关闭浏览器
        driver.quit();

        //1.打开浏览器
        RemoteWebDriver driver2=driver("edge");
        //2、访问网址
        driver2.get("https://v.qq.com/");
        //3、将浏览器窗口最大化
        //链式调用
        driver2.manage().window().maximize();
        //4、关闭浏览器
        driver2.quit();
            }


    public static RemoteWebDriver driver (String Name){

        if("chrome".equalsIgnoreCase(Name)){
            //打开chrome浏览器
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            return new ChromeDriver();
        }
//        else if("firefox".equalsIgnoreCase(Name)){
//            //打开firefox浏览器
//            System.setProperty("webdriver.gecko.driver","ssrc/test/resources/geckodriver.exe");
//            return new FirefoxDriver();
//        }
        else if("edge".equalsIgnoreCase(Name)){
            //打开edge浏览器
            System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
            return new EdgeDriver();
        }else {
            System.out.println("浏览器暂时不支持或者浏览器名有误");
            return null;
        }
    }

        public static void openEdge(){
            //1、打开浏览器（edge）
            System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
            EdgeDriver driver = new EdgeDriver();
            driver.get("https://www.baidu.com");
            driver.manage().window().maximize();
        }
        public static void openChrome(){
            //1、打开浏览器（chrome）--全新的浏览器，里面没有任何用户数据
            //告诉代码指定驱动的路径
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            //2、访问网址
            driver.get("https://www.baidu.com");
            //3、将浏览器窗口最大化
            //链式调用
            driver.manage().window().maximize();
            //4、关闭浏览器
            driver.quit();
        }

//    public static void openFirefox(){
//        //1、打开浏览器（firefox）
//        //指定firefox驱动的路径
//        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
    }


