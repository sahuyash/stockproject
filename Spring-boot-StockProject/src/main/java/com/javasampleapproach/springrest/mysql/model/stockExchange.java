package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock_Exchange")
public class stockExchange {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_exchange_id")
	private long id;
	@Column(name="Stock_Exchange")
	private int stockExchange;
	@Column(name="Brief")
	private String brief;
	@Column(name="Contact_Address")
	private String contactAddress;
	@Column(name="Remarks")
	private String Remarks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public stockExchange(long id, int stockExchange, String brief, String contactAddress, String remarks) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.brief = brief;
		this.contactAddress = contactAddress;
		Remarks = remarks;
	}
	
	
	
	
	
}
