package com.peng.springwebcrud.config;

import com.peng.springwebcrud.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: peng
 * @Date: 2020/10/27 21:30
 * @Description:即保存了自动配置又实现了我们的扩展配置
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送peng请求也会来到success页面
        registry.addViewController("/peng").setViewName("404");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/dashboard.html").setViewName("dashboard");

//        修改主页指定为某页面
//        registry.addViewController("/").setViewName("success");
//        registry.addViewController("/index.html").setViewName("success");
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/login.html","/","/login");
    }
}
