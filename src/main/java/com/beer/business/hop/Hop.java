package com.beer.business.hop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String hopName;
	private double alphaAcid;
	private String flavor;

	public Hop(int iD, String hopName, double alphaAcid, String flavor) {
		super();
		ID = iD;
		this.hopName = hopName;
		this.alphaAcid = alphaAcid;
		this.flavor = flavor;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getHopName() {
		return hopName;
	}

	public void setHopName(String hopName) {
		this.hopName = hopName;
	}

	public double getAlphaAcid() {
		return alphaAcid;
	}

	public void setAlphaAcid(double alphaAcid) {
		this.alphaAcid = alphaAcid;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

}
