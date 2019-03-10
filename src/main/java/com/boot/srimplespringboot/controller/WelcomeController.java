package com.boot.srimplespringboot.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
/**
 * Created by wzj on 2018/3/14.
 */
@Controller
public class WelcomeController
{
    /**
     * 首页
     * @return 测试
     */
    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String welcome()
    {
        return "Hello World";
    }
 
    @RequestMapping(value = "/index")
    public String index()
    {

 
        return "index";
    }


    @RequestMapping(value = "/mytest")
    public String test()
    {
        return "hello_html";
    }
}