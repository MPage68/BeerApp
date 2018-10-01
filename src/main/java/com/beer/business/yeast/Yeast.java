package com.beer.business.yeast;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Yeast {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String yeastName;
	private String style;
	private String attenuation;
	private String floculation;

	public Yeast(int iD, String yeastName, String style, String attenuation, String floculation) {
		super();
		ID = iD;
		this.yeastName = yeastName;
		this.style = style;
		this.attenuation = attenuation;
		this.floculation = floculation;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getYeastName() {
		return yeastName;
	}

	public void setYeastName(String yeastName) {
		this.yeastName = yeastName;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getAttenuation() {
		return attenuation;
	}

	public void setAttenuation(String attenuation) {
		this.attenuation = attenuation;
	}

	public String getFloculation() {
		return floculation;
	}

	public void setFloculation(String floculation) {
		this.floculation = floculation;
	}

}
