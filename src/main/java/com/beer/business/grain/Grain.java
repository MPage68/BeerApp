package com.beer.business.grain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String grainName;
	private String loviBond;

	public Grain() {
		super();
	}

	public Grain(int iD, String grainName, String loviBond) {
		super();
		ID = iD;
		this.grainName = grainName;
		this.loviBond = loviBond;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGrainName() {
		return grainName;
	}

	public void setGrainName(String grainName) {
		this.grainName = grainName;
	}

	public String getLoviBond() {
		return loviBond;
	}

	public void setLoviBond(String loviBond) {
		this.loviBond = loviBond;
	}

}
