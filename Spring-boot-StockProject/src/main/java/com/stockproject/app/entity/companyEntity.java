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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
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
	@OneToOne
	private sectorEntity sector;
	@ManyToMany
	private List<stockExchangeEntity> stockExchanges=new ArrayList<stockExchangeEntity>();
	@OneToMany(mappedBy="companyrel")
	private List<stockPriceEntity> stockprices=new ArrayList<stockPriceEntity>();
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

	public companyEntity(long id, String companyName, double turnover, String ceo, String bod, String briefDescription,
			sectorEntity sector, List<stockExchangeEntity> stockExchanges, List<stockPriceEntity> stockprices,
			ipoEntity ipo) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.bod = bod;
		this.briefDescription = briefDescription;
		this.sector = sector;
		this.stockExchanges = stockExchanges;
		this.stockprices = stockprices;
		this.iporel = ipo;
	}

	public sectorEntity getSector() {
		return sector;
	}

	public void setSector(sectorEntity sector) {
		this.sector = sector;
	}

	public List<stockExchangeEntity> getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(List<stockExchangeEntity> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public List<stockPriceEntity> getStockprices() {
		return stockprices;
	}

	public void setStockprices(List<stockPriceEntity> stockprices) {
		this.stockprices = stockprices;
	}

	public ipoEntity getIpo() {
		return iporel;
	}

	public void setIpo(ipoEntity ipo) {
		this.iporel = ipo;
	}



}
