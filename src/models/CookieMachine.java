package models;

import interfaces.LegacyVendor;

public class CookieMachine implements LegacyVendor{

	@Override
	public String Dispence(Bill bill) {
		// TODO Auto-generated method stub
		return "Enjoy your $"+bill.getValue()+" cookie";
	}

}
