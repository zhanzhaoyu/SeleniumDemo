package javaBase.day4;

public class day041 {

    private  String name;
    private int age;
     String name1;
     int age1;

    public day041() {
    }

    public day041(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Deno(int a,int b){
        System.out.println(a/b);
    }
    public void name(){
        System.out.println("姓名"+name);
    }
    public void age(){
        System.out.println("年龄"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
