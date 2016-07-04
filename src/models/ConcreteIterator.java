package models;

import java.util.List;

import interfaces.ICoin;
import interfaces.IOption;
import interfaces.Iterator;

public class ConcreteIterator implements Iterator<IOption<ICoin>>{

	private List<ICoin> coins;
	private int index;
	
	public ConcreteIterator(List<ICoin> coins){
		this.coins = coins;
		index = -1;
	}
	
	@Override
	public IOption<ICoin> next() {
		// TODO Auto-generated method stub
		if(index+1<coins.size()){
			index++;
			return new Some<ICoin>(coins.get(index));
		}
		return new None<ICoin>();
	}

}
