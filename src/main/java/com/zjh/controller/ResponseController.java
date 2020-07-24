package com.zjh.controller;

import com.zjh.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/resp")
public class ResponseController {

    @RequestMapping("/req")
    public String reqResp(Model model){
        System.out.println("ResponseController   reqResp>>>>>>>>>>>>>>>>");
        User user = new User();
        user.setDate(new Date());
        user.setUsername("zhuojianhai");
        user.setPassword("123456");
        user.setAge(30);
        model.addAttribute("user",user);
        return "response";
    }

    /**
     * 请求转发一次请求,不用编写项目名称
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/reqvoid")
    public void reqvoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("reqvoid 执行了 》》》》》》》》》");

        //请求转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        System.out.println("方法继续执行中。。。。。");

    }

    /**
     * 重定向，需要加项目名称
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/reqdirect")
    public  void reqdirect(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("reqdirect 执行了》》》》》》》》》》》》》》》");

        // WEB-INF 文件夹不能重定向
//        response.sendRedirect(request.getContextPath() + "/WEB-INF/pages/response.jsp");
        response.sendRedirect(request.getContextPath()+"/fileupload.jsp");
        System.out.println("方法不会继续执行了。。。。。");
    }

    /***
     *
     * @return
     */
    @RequestMapping("reqmodel")
    public ModelAndView reqmodel(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setAge(32);
        user.setPassword("123456");
        user.setUsername("zhuojianhai");
        user.setDate(new Date());

        modelAndView.addObject("user",user);
        /**
         * setviewname ,会调用springmvc.xml 中配置的视图解析器
         * 找到 WEB-INF/pages/ xx.jsp 页面，
         * 并跳转到该页面
         */
        modelAndView.setViewName("response");
        return modelAndView;
    }




}
