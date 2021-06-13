package com.stockproject.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ipodbc")
public class ipoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="Company_Name")
	private String companyName;
	@Column(name="Price_Per_Share")
	private double pricePerShare;
	@OneToOne(mappedBy="iporel")
	private companyEntity companyrel;
	@ManyToMany
	private List<stockExchangeEntity> stockExchanges=new ArrayList<stockExchangeEntity>();

	
	@Column(name="Total_number_of_Shares")
	private int totalShares;
	@Column(name="Open_Date_Time")
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


	public companyEntity getCompanyrel() {
		return companyrel;
	}

	public void setCompanyrel(companyEntity companyrel) {
		this.companyrel = companyrel;
	}

	public List<stockExchangeEntity> getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(List<stockExchangeEntity> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public ipoEntity(long id, String companyName, double pricePerShare, companyEntity companyrel,
			List<stockExchangeEntity> stockExchanges, int totalShares, String datetime, String remarks) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.pricePerShare = pricePerShare;
		this.companyrel = companyrel;
		this.stockExchanges = stockExchanges;
		this.totalShares = totalShares;
		this.datetime = datetime;
		this.remarks = remarks;
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
