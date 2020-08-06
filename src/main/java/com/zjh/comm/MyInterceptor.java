package com.zjh.comm;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     * false 不放行
     * true 放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(" 拦截器 preHandle》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");

//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        return true;
    }

    /**
     * 后处理方法,controller 方法执行之后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(" 拦截器 postHandle》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
    }

    /**
     * 最后执行方法*/

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(" 拦截器 afterCompletion》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
    }
}
