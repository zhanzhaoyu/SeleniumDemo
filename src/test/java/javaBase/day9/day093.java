package javaBase.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day093 {
    public static void main(String[] args) {
        HashMap<String, Integer> str= new HashMap<>();
        str.put("张三",18);
        str.put("李四",28);
        str.put("王五",38);

        //遍历一
        Set<String> str2=str.keySet();
        for (String a:str2){
            System.out.println("姓名:"+a +" 年龄"+str.get(a));
        }
        //遍历二
        Set<Map.Entry<String, Integer>> entries = str.entrySet();
        for (Map.Entry<String, Integer>entries1:entries) {
            System.out.println(entries1.getKey()+"=="+entries1.getValue());
        }
        //遍历三
        str.forEach((key,valus)-> System.out.println(key+"==="+valus));
    }
}
