package com.zjh.controller;

import com.zjh.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/welcome")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * 参数和表单一一对应
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/formsubmit",method = {RequestMethod.POST})
    public String formsubmit(String name,String password){

        System.out.println("接受的参数 name= "+name+" password="+password);
        //模拟spring 业务层处理后返回结果


        return "success";
    }

    @RequestMapping("anno")
    public void redirectTo(HttpServletRequest request, HttpServletResponse response){
        try {

          String contextPath =   request.getContextPath();
            System.out.println("contextPath----"+contextPath);
            response.sendRedirect(contextPath+"/anno.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "testajax",method = RequestMethod.POST)
    public @ResponseBody User testajax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setUsername("request name");
        user.setAge(40);
        user.setPassword("1111111111");
        user.setDate(new Date());
        // 做响应
        return user;

    }

}
