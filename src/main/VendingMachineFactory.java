package main;

import interfaces.VendingMachine;
import models.CandyMachine;
import models.SodaMachine;

public class VendingMachineFactory {
	public VendingMachine create(String type){
		switch(type){
		case "Candy": return new CandyMachine();
		case "Soda": return new SodaMachine();
		}
		return null;
	}
}
