package com.atguigu.springboot05web01;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {
        String a;
        String b;
        String c;


    @RequestMapping("")
    public void hello(){
    }



    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1,2);

    }
}
