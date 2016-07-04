package models;

import interfaces.VendingMachine;

public class SodaMachine implements VendingMachine {

	@Override
	public String dispense(Coin coin) {
		// TODO Auto-generated method stub
		return "Enjoy your $"+coin.getValue()+" soda!";
	}

}
