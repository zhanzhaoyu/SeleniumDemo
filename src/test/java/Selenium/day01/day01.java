package Selenium.day01;

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
            System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
            EdgeDriver driver = new EdgeDriver();
            driver.get("https://www.baidu.com");
            driver.manage().window().maximize();


        }
}
