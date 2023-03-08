package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class movieEntity {
	@Id
	private int id;
	
	public movieEntity(int id, String dname, int yr, String lang) {
		super();
		this.id = id;
		this.dname = dname;
		this.yr = yr;
		this.lang = lang;
	}
	private String dname;
	private int yr;
	private String lang;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public movieEntity() {
		
	}

}
