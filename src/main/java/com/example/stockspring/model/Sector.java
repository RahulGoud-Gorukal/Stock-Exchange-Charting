package com.example.stockspring.model;

public class Sector {
	private int id;
	private String sector_name;
	private String breif;
	
	// getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSector_name() {
		return sector_name;
	}
	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}
	public String getBreif() {
		return breif;
	}
	public void setBreif(String breif) {
		this.breif = breif;
	}
	
	
	// constructor
	
	public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}

}
