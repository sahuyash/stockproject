package com.stockproject.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stock_Exchangedb")
public class stockExchangeEntity {
  
	public stockExchangeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_exchange_id")
	private long id;
	@Column(name="Stock_Exchange")
	private String stockExchange;
	@Column(name="stockExchangeName")
	private String stockExchangeName;
	@Column(name="Brief")
	private String brief;
	@Column(name="Contact_Address")
	private String contactAddress;
	@Column(name="Remarks")
	private String Remarks;
	@ManyToMany(mappedBy="stockExchanges")
	private List<companyEntity> companies=new ArrayList<companyEntity>();
	@ManyToMany
	private List<ipoEntity> ipos= new ArrayList<ipoEntity>();
	@OneToMany
	private List<stockPriceEntity> stockPrices=new ArrayList<stockPriceEntity>();
	public stockExchangeEntity(long id, String stockExchange, String stockExchangeName, String brief,
			String contactAddress, String remarks, List<companyEntity> companies, List<ipoEntity> ipos,
			List<stockPriceEntity> stockPrices) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.contactAddress = contactAddress;
		Remarks = remarks;
		this.companies = companies;
		this.ipos = ipos;
		this.stockPrices = stockPrices;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
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
	public List<companyEntity> getCompanies() {
		return companies;
	}
	public void setCompanies(List<companyEntity> companies) {
		this.companies = companies;
	}
	public List<ipoEntity> getIpos() {
		return ipos;
	}
	public void setIpos(List<ipoEntity> ipos) {
		this.ipos = ipos;
	}
	public List<stockPriceEntity> getStockPrices() {
		return stockPrices;
	}
	public void setStockPrices(List<stockPriceEntity> stockPrices) {
		this.stockPrices = stockPrices;
	}
	
	
	
	
	
}
