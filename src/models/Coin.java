package models;

import interfaces.ICoin;

public class Coin implements ICoin{
	private double value;
	private String metal;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	@Override
	public String appraise() {
		// TODO Auto-generated method stub
		return "This is a "+ metal+" coin";
	}

	
}
