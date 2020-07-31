package com.zjh.comm;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 *  WebRequestInterceptor 中也定义了三个方法，我们也是通过这三个方法来实现拦截的。
 *  这三个方法都传递了同一个参数WebRequest ，那么这个WebRequest 是什么呢？
 *  这个WebRequest 是Spring 定义的一个接口，它里面的方法定义都基本跟HttpServletRequest 一样，
 *  在WebRequestInterceptor 中对WebRequest 进行的所有操作都将同步到HttpServletRequest 中，然后在当前请求中一直传递。
 */
public class AllInterceptor implements WebRequestInterceptor {
    @Override
    public void preHandle(WebRequest request) throws Exception {

    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
