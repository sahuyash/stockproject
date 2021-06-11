package com.stockproject.mysql.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Stock Price")
public class stockPrice {
    
	@Column(name="Company_Code")
	private int companyCode;
	@Column(name="Stock_Exchange")
	private int stockExchange;
	@Column(name="Current_Price")
	private double currentPrice;
	public stockPrice(int companyCode, int stockExchange, double currentPrice, Date date, Time time) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
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
	@Column(name="Date")
	private Date date;
	@Column(name="Time")
	private Time time;
	

	
	
}
