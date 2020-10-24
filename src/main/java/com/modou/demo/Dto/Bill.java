package com.modou.demo.Dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Bill implements Serializable {
	private static final long serialVersionUID = 7171761826658994928L;
	private String body;
	private String outTradeNo;
	private String passbackParams;
	private String productCode;
	private String timeoutExpress;
	private String subject;
	private String totalAmount;
}
