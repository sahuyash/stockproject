package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Stock Exchange")
public class stockExchange {
  
	@Column(name="ID")
	private String id;
	@Column(name="Stock Exchange")
	private int stockExchange;
	@Column(name="Brief")
	private String brief;
	@Column(name="Contact Address")
	private String contactAddress;
	@Column(name="Remarks")
	private String Remarks;
	public stockExchange(String id, int stockExchange, String brief, String contactAddress, String remarks) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.brief = brief;
		this.contactAddress = contactAddress;
		Remarks = remarks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	
	
}
