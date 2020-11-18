package com.peng.springwebcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author: peng
 * @Date: 2020/10/10 10:53
 * @Description:
 */
@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String helloController(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("hello","你好！");
        return "success";
    }
}
