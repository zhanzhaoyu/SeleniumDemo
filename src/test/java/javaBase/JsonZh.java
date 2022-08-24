package javaBase;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class JsonZh {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 1);
        map.put("isVip", 1);
        map.put("info", "success");
        //序列化 map转换成Json
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
        //反序列化 Json对象转换成map
        String j = "{\"isVip\":1,\"status\":1,\"info\":\"success\"}";
        HashMap<String, Object> hashMap1 = mapper.readValue(j, HashMap.class);
        System.out.println(hashMap1);
    }
}
