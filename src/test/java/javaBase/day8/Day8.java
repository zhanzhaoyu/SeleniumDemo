package javaBase.day8;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.util.HashMap;

public class Day8 {
    public static void main(String[] args) throws Exception {
        String string ="{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }";
        ObjectMapper mapper = new ObjectMapper();
        //JSON字符串转对象
        HashMap <String,Object> hashMap = mapper.readValue(string, HashMap.class);
        System.out.println(hashMap);

        String string2 ="{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";
        ObjectMapper mapper1 = new ObjectMapper();
        //JSON字符串转对象
        HashMap <String,Object> hashMap2 = mapper1.readValue(string2, HashMap.class);
        System.out.println(hashMap2);

        //生成ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //对象转YAML
        String yaml = objectMapper.writeValueAsString(hashMap2);
        System.out.println(yaml);



    }




}
