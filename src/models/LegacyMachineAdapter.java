package models;

import interfaces.VendingMachine;
import interfaces.LegacyVendor;

public class LegacyMachineAdapter implements VendingMachine{
	
	private LegacyVendor legacy;
	
	public LegacyMachineAdapter(LegacyVendor legacy){
		this.legacy = legacy;
	}

	@Override
	public String dispense(Coin coin) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		bill.setValue(coin.getValue());
		return legacy.Dispence(bill);
	}

}
