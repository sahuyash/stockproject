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
    @Column(name="Company_Name")
    private String companyName;	
    @Column(name="Stock_Exchange")
    private int stockExchange;
    @Column(name="Price_Per_Share")
    private double pricePerShare;
    public ipo(long id, String companyName, int stockExchange, double pricePerShare, int totalShares, String datetime,
			String remarks) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.datetime = datetime;
		this.remarks = remarks;
	}
	@Column(name=" Total number of Shares")
    private int totalShares;
    @Column(name="Open Date Time")
    private String datetime;
    @Column(name="Remarks")
    private String remarks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
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
	

    
    	
	
}
