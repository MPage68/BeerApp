package com.beer.business.recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String recipeName;
	private String style;
	private double ibu;
	private double abv;
	private double srm;
	private String grain1;
	private String grain2;
	private String grain3;
	private String grain4;
	private String grain5;
	private String hop1;
	private String hop2;
	private String hop3;
	private String hop4;
	private String hop5;
	private String yeast;
	
	public Recipe() {
		super();
	}

	public Recipe(int iD, String recipeName, String style, double ibu, double abv, double srm, String grain1,
			String grain2, String grain3, String grain4, String grain5, String hop1, String hop2, String hop3,
			String hop4, String hop5, String yeast) {
		super();
		ID = iD;
		this.recipeName = recipeName;
		this.style = style;
		this.ibu = ibu;
		this.abv = abv;
		this.srm = srm;
		this.grain1 = grain1;
		this.grain2 = grain2;
		this.grain3 = grain3;
		this.grain4 = grain4;
		this.grain5 = grain5;
		this.hop1 = hop1;
		this.hop2 = hop2;
		this.hop3 = hop3;
		this.hop4 = hop4;
		this.hop5 = hop5;
		this.yeast = yeast;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public double getIbu() {
		return ibu;
	}

	public void setIbu(double ibu) {
		this.ibu = ibu;
	}

	public double getAbv() {
		return abv;
	}

	public void setAbv(double abv) {
		this.abv = abv;
	}

	public double getSrm() {
		return srm;
	}

	public void setSrm(double srm) {
		this.srm = srm;
	}

	public String getGrain1() {
		return grain1;
	}

	public void setGrain1(String grain1) {
		this.grain1 = grain1;
	}

	public String getGrain2() {
		return grain2;
	}

	public void setGrain2(String grain2) {
		this.grain2 = grain2;
	}

	public String getGrain3() {
		return grain3;
	}

	public void setGrain3(String grain3) {
		this.grain3 = grain3;
	}

	public String getGrain4() {
		return grain4;
	}

	public void setGrain4(String grain4) {
		this.grain4 = grain4;
	}

	public String getGrain5() {
		return grain5;
	}

	public void setGrain5(String grain5) {
		this.grain5 = grain5;
	}

	public String getHop1() {
		return hop1;
	}

	public void setHop1(String hop1) {
		this.hop1 = hop1;
	}

	public String getHop2() {
		return hop2;
	}

	public void setHop2(String hop2) {
		this.hop2 = hop2;
	}

	public String getHop3() {
		return hop3;
	}

	public void setHop3(String hop3) {
		this.hop3 = hop3;
	}

	public String getHop4() {
		return hop4;
	}

	public void setHop4(String hop4) {
		this.hop4 = hop4;
	}

	public String getHop5() {
		return hop5;
	}

	public void setHop5(String hop5) {
		this.hop5 = hop5;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String yeast) {
		this.yeast = yeast;
	}
	
	

}
