package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPO")
public class ipo {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    @Column(name="Company Name")
    private String companyName;	
    @Column(name="Stock Exchange")
    private int stockExchange;
    @Column(name="Price Per Share")
    private int pricePerShare;
    @Column(name=" Total number of Shares")
    private int totalShares;
    @Column(name="Open Date Time")
    private String datetime;
    @Column(name="Remarks")
    private String remarks;
	
    public long getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public int getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public ipo(String id, String companyName, int stockExchange, int pricePerShare, int totalShares, String datetime,
			String remarks) {
		super();
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.datetime = datetime;
		this.remarks = remarks;
	}
    
    
    	
	
}
