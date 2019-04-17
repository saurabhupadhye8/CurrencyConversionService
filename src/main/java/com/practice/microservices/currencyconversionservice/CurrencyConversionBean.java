package com.practice.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	protected CurrencyConversionBean() {
		
	}

	public CurrencyConversionBean(long id, String from, String to, BigDecimal conversionFactor, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionMultiple(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	} 
	
	
	

}
