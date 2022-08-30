package Selenium;


import com.sun.tools.xjc.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class day3 {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.edge.driver","src\\test\\resources\\msedgedriver.exe");
        //打开浏览器
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://mall.lemonban.com:3344/");
        //窗口最大化
        driver.manage().window().maximize();
        //点击登入
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div[2]/div[1]/span[2]/a[1]")).click();
        //输入账号
        driver.findElement(By.className("input")).sendKeys("waiwai");
        //输入密码
        driver.findElement(By.cssSelector("#__layout > div > div.top > div.login > div.login-box > div.login-con > div.item.password > input")).sendKeys("lemon123456");
        //点击登入
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[2]/div[3]/a")).click();
        //点击商品列表
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#__layout > div > div.home > div.head > div > div.menu > a:nth-child(2)")).click();
        //点击商品
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]")).click();//点击商品
        //加入购物车
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#__layout > div > div.detail.base > div > div.detail-up > div.info > div.btns > a.add-cart")).click();
        driver.quit();
//        driver.findElement(By.cssSelector("input[]"))


    }

}
