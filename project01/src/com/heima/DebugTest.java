package com.heima;

import java.util.HashMap;
import java.util.Map;

public class DebugTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "tom");
        map.put("age", "25");
        map.put("salary", "10000");
        map.put("dept", "it");
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("salary"));
        System.out.println(map.get("dept"));
    }

}
