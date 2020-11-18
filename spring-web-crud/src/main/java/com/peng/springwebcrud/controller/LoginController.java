package com.peng.springwebcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author: peng
 * @Date: 2020/10/28 16:53
 * @Description:
 */

@Controller
public class LoginController {

    //    @RequestMapping(value = "user/login",method = RequestMethod.POST)
    @PostMapping(value = "/login")
    public String login(String username,
                        String password,
                        Map<String,Object> map,
                        HttpSession httpSession){
        if (!username.isEmpty() && "123456".equals(password)){
            //重定向，防止表单重复提交
            httpSession.setAttribute("userLogin",username);
            return "redirect:/index.html";

        }
        else {
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
}
