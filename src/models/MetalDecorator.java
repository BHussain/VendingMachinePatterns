package models;

import interfaces.ICoin;

public class MetalDecorator extends ICoinDecorator{

	public MetalDecorator(ICoin coin, String metal){
		this.coin = coin;
		this.coin.setMetal(metal);
	}
	
	@Override
	public String appraise() {
		// TODO Auto-generated method stub
		return coin.appraise();
	}

	@Override
	public String getMetal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMetal(String metal) {
		// TODO Auto-generated method stub
		
	}

}
