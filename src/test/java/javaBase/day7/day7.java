package javaBase.day7;

import java.util.*;

public class day7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        //创建一个迭代对象
        Iterator<Integer> it = list.iterator();
        //判断是有元素
        while(it.hasNext()){
            //获取元素
            int next=it.next();
            System.out.println(next);

        }
        HashMap<String, Integer> str= new HashMap<>();
        str.put("张三",18);
        str.put("李四",28);
        str.put("王五",38);
        Set<String> str2=str.keySet();
        //遍历一
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

        

        HashSet<String> set =new HashSet<>();
        set.add("张");
        set.add("李");
        set.add("刘");
        set.add("刘");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            String next =itr.next();
            System.out.println(next);
        }



    }
}
