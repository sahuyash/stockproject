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
    
	public stockPriceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Company_Code")
	private int companyCode;
	@ManyToOne
	private companyEntity companyrel;
	@Column(name="StockExchange")
	private String stockExchange;
	
	@ManyToOne
	private stockExchangeEntity stockExchanges;

	@Column(name="Current_Price")
	private double currentPrice;
	public stockPriceEntity(long id, int companyCode, companyEntity companyrel, String stockExchange,
			stockExchangeEntity stockExchanges, double currentPrice, Date date, Time time) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.companyrel = companyrel;
		this.stockExchange = stockExchange;
		this.stockExchanges = stockExchanges;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public companyEntity getCompanyrel() {
		return companyrel;
	}
	public void setCompanyrel(companyEntity companyrel) {
		this.companyrel = companyrel;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public stockExchangeEntity getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(stockExchangeEntity stockExchanges) {
		this.stockExchanges = stockExchanges;
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
	@Column(name="Date1")
	private Date date;
	@Column(name="Time1")
	private Time time;
	

	
	
}