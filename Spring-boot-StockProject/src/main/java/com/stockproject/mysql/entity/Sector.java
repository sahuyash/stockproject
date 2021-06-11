package com.stockproject.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
  @Column(name="Sector_Name")
	private String sectorName;
  @Column(name="Brief")
	private String brief;
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
public Sector(long id, String sectorName, String brief) {
	super();
	this.id = id;
	this.sectorName = sectorName;
	this.brief = brief;
}
  
	
}
