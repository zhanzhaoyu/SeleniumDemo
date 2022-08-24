package javaBase.day9;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class day091 {
    public static void main(String[] args) throws JsonProcessingException {
        //解析json数据
        ObjectMapper mapper = new ObjectMapper();

        HashMap<Object, Object> map = new HashMap<>();
        map.put("张三",18);
        map.put("李四",28);
        map.put("王五",38);
        //java->String
        String s = mapper.writeValueAsString(map);
        System.out.println(s);

        //String->java
        String s2="{\"李四\":28,\"张三\":18,\"王五\":38}";
        HashMap hashMap=mapper.readValue(s,HashMap.class);
        System.out.println(s);



    }
}
