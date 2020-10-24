package com.modou.demo.interceptor;

import com.alipay.api.AlipayApiException;
import com.modou.alipay.AliPayApiConfigKit;
import com.modou.demo.controller.alipay.AbstractAliPayApiController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>modou 。</p>
 *

 *
 * <p>支付宝支付拦截器</p>
 *
 * @author 金钰鑫
 */
public class AliPayInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws AlipayApiException {
        if (HandlerMethod.class.equals(handler.getClass())) {
            HandlerMethod method = (HandlerMethod) handler;
            Object controller = method.getBean();
            if (!(controller instanceof AbstractAliPayApiController)) {
                throw new RuntimeException("控制器需要继承 AbstractAliPayApiController");
            }
            AliPayApiConfigKit.setThreadLocalAliPayApiConfig(((AbstractAliPayApiController) controller).getApiConfig());
            return true;
        }
        return false;
    }
}
