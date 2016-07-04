package models;

import interfaces.ICoin;
import interfaces.IOptionVisitor;

public class MetalPrinter implements IOptionVisitor<ICoin,String>{

	@Override
	public String onSome(ICoin value) {
		// TODO Auto-generated method stub
		return value.appraise();
	}

	@Override
	public String onNone() {
		// TODO Auto-generated method stub
		return "Not a coin";
	}

}
