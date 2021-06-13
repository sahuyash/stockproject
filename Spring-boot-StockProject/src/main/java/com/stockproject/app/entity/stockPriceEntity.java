package com.stockproject.app.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stock_Pricedb")
public class stockPriceEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Company_Code")
	private int companyCode;
	@ManyToOne
	private companyEntity companyrel;
	@ManyToOne
	private stockExchangeEntity stockExchange;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="Current_Price")
	private double currentPrice;
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public companyEntity getCompany() {
		return companyrel;
	}
	public void setCompany(companyEntity company) {
		this.companyrel = company;
	}
	public stockExchangeEntity getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(stockExchangeEntity stockExchange) {
		this.stockExchange = stockExchange;
	}
	public stockPriceEntity(long id, int companyCode, companyEntity company, stockExchangeEntity stockExchange,
			double currentPrice, Date date, Time time) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.companyrel = company;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
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
