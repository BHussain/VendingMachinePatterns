package main;

import java.util.ArrayList;
import java.util.List;

import interfaces.VendingMachine;
import interfaces.ICoin;
import interfaces.IOption;
import interfaces.IOptionVisitor;
import interfaces.Iterator;
import interfaces.LegacyVendor;
import models.Coin;
import models.ConcreteIterator;
import models.CookieMachine;
import models.LegacyMachineAdapter;
import models.MetalDecorator;
import models.MetalPrinter;

public class Client {
	public static void main(String[] args){
		VendingMachineFactory factory = new VendingMachineFactory();
		List<VendingMachine> machines = new ArrayList<>();
		
		machines.add(factory.create("Candy"));
		machines.add(factory.create("Soda"));
		Coin coin = new Coin();
		coin.setMetal("Copper");
		coin.setValue(10.0);
		ICoin newCoin = new MetalDecorator(new Coin(),"Gold");
		
		for(VendingMachine machine:machines){
			System.out.println(machine.dispense(coin));
		}
		
		LegacyVendor cookie = new CookieMachine();
		LegacyMachineAdapter adapter = new LegacyMachineAdapter(cookie);
		
		System.out.println(adapter.dispense(coin));
		
		List<ICoin> coins = new ArrayList<>();
		coins.add(coin);
		coins.add(newCoin);
		Iterator<IOption<ICoin>> it = new ConcreteIterator(coins);
		IOptionVisitor<ICoin,String> visitor = new MetalPrinter();
		boolean done = false;
		
		while(!done){
			IOption<ICoin> option = it.next();
			if(!option.visit(visitor).equals("Not a coin")){
				System.out.println(option.visit(visitor));
			}else{
				done = true;
			}
			
		}
	}
}
