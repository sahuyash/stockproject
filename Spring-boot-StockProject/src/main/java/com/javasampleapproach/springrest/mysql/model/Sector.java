package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
  @Column(name="ID")
	private String id;
  @Column(name="Sector Name")
	private String sectorName;
  @Column(name="Brief")
	private String brief;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSectorName() {
	return sectorName;
}
public Sector(String id, String sectorName, String brief) {
	super();
	this.id = id;
	this.sectorName = sectorName;
	this.brief = brief;
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
	
}
