package com.atguigu.springboot05web01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("age","15");
        map.put("school","tinghua");
        map.put("name","tom");
        map.put("major","sc");
        String age = map.get("age");
        System.out.println(age);
        map.remove("major");
    }
}
