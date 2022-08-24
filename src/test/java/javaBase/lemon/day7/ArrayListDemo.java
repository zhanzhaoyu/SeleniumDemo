package javaBase.lemon.day7;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListDemo {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("张三",25);
        Teacher t2 =new Teacher("李四",35);
        Teacher t3 =new Teacher("王五",19);
        Teacher t4 =new Teacher("赵六",29);

        ArrayList<Teacher> list=new ArrayList();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            ArrayList dd1=new ArrayList();
//            dd1.add(list.get(i));
//            System.out.println(dd1);
        }
        int age=0;
        for (Teacher i:list) {
            System.out.println(i);
            age+=i.getAge();

        }
        System.out.println("老师平均年龄"+age/list.size());

        HashMap<String,Object> map=new HashMap();
        map.put("id","idid");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");
        if(map.containsKey("mobile_phone")){
            System.out.println(map.get("mobile_phone"));
        }else {
            System.out.println("提示：查询api文档中HashMap中判断是否存在键的方法");
        }
        map.replace("pwd","88888888");
        System.out.println(map.get("pwd"));
    }
}
