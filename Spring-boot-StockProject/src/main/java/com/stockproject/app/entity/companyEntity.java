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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class companyEntity {

	public companyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public ipoEntity getIporel() {
		return iporel;
	}

	public void setIporel(ipoEntity iporel) {
		this.iporel = iporel;
	}

	@Column(name = "company_id")
	private String companyId;
	@Column(name = "Company_Name")
	private String companyName;
	@Column(name = "Turnover")
	private double turnover;

	@Column(name = "CEO")
	private String ceo;
	@Column(name = "Board_of_Director")
	private String bod;

	@Column(name = "description")
	private String briefDescription;
	private String sector;
	//@OneToOne
	//private sectorEntity sector;
	@OneToMany(mappedBy="companyrel")
	private List<stockPriceEntity> stockprices=new ArrayList<stockPriceEntity>();
	public List<stockPriceEntity> getStockprices() {
		return stockprices;
	}

	public void setStockprices(List<stockPriceEntity> stockprices) {
		this.stockprices = stockprices;
	}

	@ManyToMany
	private List<stockExchangeEntity> stockExchanges=new ArrayList<stockExchangeEntity>();
	
	@OneToOne
	private ipoEntity iporel;

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

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public String getBriefDescription() {
		return briefDescription;
	}

	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	public companyEntity(long id, String companyId, String companyName, double turnover, String ceo, String bod,
			String briefDescription, String sector, List<stockPriceEntity> stockprices,
			List<stockExchangeEntity> stockExchanges, ipoEntity iporel) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.bod = bod;
		this.briefDescription = briefDescription;
		this.sector = sector;
		this.stockprices = stockprices;
		this.stockExchanges = stockExchanges;
		this.iporel = iporel;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public List<stockExchangeEntity> getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(List<stockExchangeEntity> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public ipoEntity getIpo() {
		return iporel;
	}

	public void setIpo(ipoEntity ipo) {
		this.iporel = ipo;
	}



}
