package com.modou.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>modou 。</p>
 *

 *
 * <p>PayPal配置 Bean</p>
 *
 * @author 金钰鑫
 */
@Component
//@PropertySource("classpath:/xpay.properties")
@ConfigurationProperties(prefix = "xpay")
public class XPayBean {
    private String key;
    private String mchId;
    private String domain;
    private String serverUrl;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String toString() {
        return "XPayBean{" +
                "key='" + key + '\'' +
                ", mchId='" + mchId + '\'' +
                ", domain='" + domain + '\'' +
                ", serverUrl='" + serverUrl + '\'' +
                '}';
    }
}
