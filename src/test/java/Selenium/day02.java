//package Selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class day02 {
//    public static void main(String[] args) throws InterruptedException {
//        //打开浏览器
//        RemoteWebDriver driver = openBrowser("edge");
//        driver.get("http://mall.lemonban.com:3344/");
//        //窗口最大化
//        driver.manage().window().maximize();
//        //点击登入
//        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div[2]/div[1]/span[2]/a[1]")).click();
//        //输入账号
//        driver.findElement(By.className("input")).sendKeys("waiwai");
//        //输入密码
//        driver.findElement(By.cssSelector("#__layout > div > div.top > div.login > div.login-box > div.login-con > div.item.password > input")).sendKeys("lemon123456");
//        //点击登入
//        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div[3]/a")).click();
//        //点击商品列表
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#__layout > div > div.home > div.head > div > div.menu > a:nth-child(2)")).click();
//        //点击商品
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]")).click();//点击商品
//        //加入购物车
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#__layout > div > div.detail.base > div > div.detail-up > div.info > div.btns > a.add-cart")).click();
//
//
////        //谷歌浏览器
////        RemoteWebDriver driver2 = openBrowser("chrome");
////        driver2.get("https://www.baidu.com");
////        driver2.manage().window().maximize();
////        //1.id定位
////        driver2.findElement(By.id("kw")).sendKeys("柠檬班");
////        driver2.findElement(By.cssSelector("#su")).click();
//
////        //firefox浏览器
////        RemoteWebDriver driver3 = openBrowser("firefox");
////        driver3.get("http://mall.lemonban.com:3344/");
////        driver3.manage().window().maximize();
//
//
//
////        //谷歌浏览器
////        RemoteWebDriver driver2 = openBrowser("chrome");
////        driver2.get("https://www.baidu.com");
////        driver2.manage().window().maximize();
////        driver2.quit();
////        driver2.quit();
//
//
//
//
//    }
//
//    public static RemoteWebDriver openBrowser(String browserName){
//            //判断
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
//
//     public static void openEdge(){
//         //1、打开浏览器（edge）
//         System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
//         EdgeDriver driver = new EdgeDriver();
//         driver.get("https://www.baidu.com");
//         driver.manage().window().maximize();
//     }
//
//    public static void openFirefox(){
//        //1、打开浏览器（firefox）
//        //指定firefox驱动的路径
//        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
//    }
//
//    public static void openChrome(){
//        //1、打开浏览器（chrome）--全新的浏览器，里面没有任何用户数据
//        //告诉代码指定驱动的路径
//        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        //2、访问网址
//        driver.get("https://www.baidu.com");
//        //3、将浏览器窗口最大化
//        //链式调用
//        driver.manage().window().maximize();
//        //4、关闭浏览器
//        driver.quit();
//    }
//}
//
