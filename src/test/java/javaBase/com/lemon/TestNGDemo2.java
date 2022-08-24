package javaBase.com.lemon;

import org.testng.annotations.*;


public class TestNGDemo2 {
    @Test
    public void p1() {
        System.out.println("p1。。。");
    }
    @BeforeSuite
    public void p2(){
        System.out.println("beforesuite 2。。。");
    }

    @AfterSuite
    public void p3(){
        System.out.println("AfterSuite 3。。。");
    }
    @BeforeTest
    public void p4(){
        System.out.println("BeforeTest  4。。。");
    }
    @AfterTest
    public void p5(){
        System.out.println("AfterTest 5。。。");
    }
    @BeforeClass
    public void p6(){
        System.out.println("BeforeClass 6。。。");
    }
    @AfterClass
    public void p7(){
        System.out.println("AfterClass 7。。。");
    }
    @Test
    @Parameters({"type","version"})
    public void p8(String t,String v){
        System.out.println("t="+t+" ,v="+v);
    }
    @Test(dataProvider="datas")
    public void p9(String t,String v){
        System.out.println("t="+t+" ,v="+v);
    }
    @Test(dataProvider="p11")
    public void p10(User use){
        System.out.println(use.getUsername()+"="+use.getPassword());
    }
    @DataProvider
    public Object[] p11(){
        User u1=new User("张三1","1111");
        User u2=new User("李四1","2222");
        User u3=new User("王五1","3333");
        Object[] data2={u1,u2,u3};
        return data2;
    }
    @DataProvider
    public Object[][] datas(){
        Object[][] data={
            {"张三","1111"},
            {"李四","2222"},
            {"王五","3333"}
        };
        return data;
    }
}
