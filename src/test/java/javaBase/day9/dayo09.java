package javaBase.day9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class dayo09 {
    public static void main(String[] args) throws Exception {
        String str ="{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }";

        ObjectMapper mapper = new ObjectMapper();
        //JSON字符串转对象
        HashMap json = mapper.readValue(str, HashMap.class);
        //还可以支持将JSON文件转对象
//        HashMap json = mapper.readValue(new File("data.json"), HashMap.class);
        System.out.println(json);
        String str2="{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }\n";

    }
}
