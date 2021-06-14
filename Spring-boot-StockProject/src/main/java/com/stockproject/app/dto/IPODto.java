package com.stockproject.app.dto;

import java.sql.Time;
import java.util.Date;

public class IPODto {

	private String companyName;
	private String stockExchange;
	private float pricePerShare;
	private Integer totalShares;
	private Date date;
	private Time time;
	private String remarks;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Integer getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(Integer totalShares) {
		this.totalShares = totalShares;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
