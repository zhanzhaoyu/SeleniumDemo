package Selenium.day01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class day011 {
    public static void main(String[] args) {
//        openServer();
//        openServer2();
        RemoteWebDriver driver=openServer3("chrome");
        //2.访问网址
        driver.get("https://v.qq.com/");
        //3.窗口最大化
        driver.manage().window().maximize();
        //4.关闭浏览器
        driver.quit();

        RemoteWebDriver driver2=openServer3("edge");
        //2.访问网址
        driver2.get("https://v.qq.com/");
        //3.窗口最大化
        driver2.manage().window().maximize();
        //4.关闭浏览器
        driver2.quit();
    }
    public static RemoteWebDriver openServer3(String name){
        if(name.equalsIgnoreCase("edge")){
            //1.打开浏览器
            System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
//            ChromeDriver driver = new EdgeDriver();
//            //2.访问网址
//            driver.get("https://v.qq.com/");
//            //3.窗口最大化
//            driver.manage().window().maximize();
//            //4.关闭浏览器
//            driver.quit();
            return  new EdgeDriver();
        }else  if(name.equalsIgnoreCase("chrome")){
            //1.打开浏览器
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
//            EdgeDriver driver = new ChromeDriver();
//            //2.打开网址
//            driver.get("https://baidu.com");
//            //3.窗口最大化
//            driver.manage().window().maximize();
            return new ChromeDriver();

        }else{
            System.out.println("浏览器输入有误");
            return  null;
        }



    }
    public static void openServer(){
        //1.打开浏览器
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //2.访问网址
        driver.get("https://v.qq.com/");
        //3.窗口最大化
        driver.manage().window().maximize();
        //4.关闭浏览器
        driver.quit();
    }
    public static void openServer2(){
        //1.打开浏览器
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //2.访问网址
        driver.get("https://v.qq.com/");
        //3.窗口最大化
        driver.manage().window().maximize();
        //4.关闭浏览器
        driver.quit();
    }
}
