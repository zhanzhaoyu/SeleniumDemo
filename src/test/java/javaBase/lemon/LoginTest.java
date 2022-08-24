package javaBase.lemon;

import org.testng.annotations.*;

@Test

public class LoginTest {

    @BeforeClass
    public void LoginTestBefore() {
        System.out.println("登录测试类执行开始");
    }

    @BeforeMethod
    public void loginSuccessBefore() {
        System.out.println("登录测试方法执行开始");
    }

    public void loginSuccess() {
        System.out.println("登录成功。。");
    }

    @AfterMethod
    public void loginSuccessAfter() {
        System.out.println("登录测试方法执行结束");
    }

    @AfterClass
    public void LoginTestAfter() {
        System.out.println("登录测试类执行结束");
    }
}
