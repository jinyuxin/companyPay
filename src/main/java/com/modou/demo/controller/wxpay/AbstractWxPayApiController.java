package com.modou.demo.controller.wxpay;


import com.modou.wxpay.WxPayApiConfig;

/**
 * @author 金钰鑫
 */
public abstract class AbstractWxPayApiController {
    /**
     * 获取微信支付配置
     *
     * @return {@link WxPayApiConfig} 微信支付配置
     */
    public abstract WxPayApiConfig getApiConfig();
}
