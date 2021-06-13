package com.stockproject.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sectordb")
public class sectorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
  @Column(name="Sector_Name")
	private String sectorName;
  @Column(name="Brief")
	private String brief;
  @OneToOne(mappedBy="sector")
  private companyEntity companyrel;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getSectorName() {
	return sectorName;
}
public void setSectorName(String sectorName) {
	this.sectorName = sectorName;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public sectorEntity(long id, String sectorName, String brief, companyEntity companyrel) {
	super();
	this.id = id;
	this.sectorName = sectorName;
	this.brief = brief;
	this.companyrel = companyrel;
}
public companyEntity getCompanyrel() {
	return companyrel;
}
public void setCompanyrel(companyEntity companyrel) {
	this.companyrel = companyrel;
}
public sectorEntity() {
	super();
	// TODO Auto-generated constructor stub
}

  
	
}
