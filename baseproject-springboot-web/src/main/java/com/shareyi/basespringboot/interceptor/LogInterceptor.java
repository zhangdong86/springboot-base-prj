package com.shareyi.basespringboot.interceptor;

import com.shareyi.basespringboot.common.constants.CommonConstant;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 日志相关拦截器
 *
 * @author david
 * @date 2018/11/4
 */
@Component
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("当前线程：" + Thread.currentThread().getName());

        String sid = httpServletRequest.getParameter(CommonConstant.SID);
        if (StringUtils.isNotEmpty(sid)) {
            MDC.put(CommonConstant.SID, sid);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        MDC.remove(CommonConstant.SID);
    }
}
