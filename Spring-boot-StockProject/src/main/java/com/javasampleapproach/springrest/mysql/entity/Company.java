package com.javasampleapproach.springrest.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
    
	
	@Column(name="Company_Name")
	private String companyName;
	@Column(name="Turnover")
	private double turnover;
	@Column(name="CEO")
	private String ceo;
	@Column(name="Board_of_Director")
	private String bod;
	@Column(name="sector")
	private String sector;
	@Column(name="Brief writeup, about companies Services/Product, etc…")
	private String briefDescription;
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
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefDescription() {
		return briefDescription;
	}
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}
	public Company(String companyName, double turnover, String ceo, String bod, String sector,
			String briefDescription) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.bod = bod;
		this.sector = sector;
		this.briefDescription = briefDescription;
	}	
	
}
