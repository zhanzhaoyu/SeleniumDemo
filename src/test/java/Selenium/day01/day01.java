package Selenium.day01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class day01 {
        public static void main(String[] args) {
            //openChrome();
            //openFirefox();
            //openEdge();
//        RemoteWebDriver driver = openBrowser("cHROME");
//        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
            //1、打开浏览器（edge）
//            System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
//            EdgeDriver driver = new EdgeDriver();
//            driver.get("https://www.baidu.com");
//            driver.manage().window().maximize();

            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.baidu.com");
            driver.manage().window().maximize();

          //1、打开浏览器（chrome）--全新的浏览器，里面没有任何用户数据
        //告诉代码指定驱动的路径
//        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        //2、访问网址
//        driver.get("https://www.baidu.com");
//        //3、将浏览器窗口最大化
//        //链式调用
//        driver.manage().window().maximize();
//        //4、关闭浏览器
//        driver.quit();

        }
}
