package com.javasampleapproach.springrest.mysql.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Stock Price")
public class stockPrice {
    
	@Column(name="Company Code")
	private String companyCode;
	@Column(name="Stock Exchange")
	private int stockExchange;
	@Column(name="Current Price")
	private double currentPrice;
	@Column(name="Date")
	private Date date;
	@Column(name="Time")
	private Time time;
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public stockPrice(String companyCode, int stockExchange, double currentPrice, Date date, Time time) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}

	
	
}
