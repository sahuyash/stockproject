package com.javasampleapproach.springrest.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainings")
public class Tranings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "userid")
	private int userid;

	@Column(name = "mentorid")
	private int mentorid;

	@Column(name = "status")
	private int status;
	
	@Column(name = "progress")
	private int progress;

	public Tranings() {
		
	}
	
	public Tranings(long id, int userid, int mentorid, int status, int progress) {
		super();
		this.id = id;
		this.userid = userid;
		this.mentorid = mentorid;
		this.status = status;
		this.progress = progress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userId) {
		this.userid = userId;
	}

	public int getMentorid() {
		return mentorid;
	}

	public void setMentorid(int mentorid) {
		this.mentorid = mentorid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	
}
