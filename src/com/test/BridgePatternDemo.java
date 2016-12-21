package com.test;

public class BridgePatternDemo {

	public static void main(String[] args) {
		NumberImpl no = new NumberImpl(10.45);
		NumberBridge number = new NumberString(no);
		double n= no.getNumber();
		 String str = number.getNumber();
		
		System.out.println(str);
	}
}

interface Number {
	public double getNumber();
}

class NumberImpl implements Number {
	double no = 10.23;
	
	public NumberImpl(double d){
		this.no = d;
	}

	@Override
	public double getNumber() {
		return no;
	}
}

abstract class NumberBridge {
	Number number;

	public NumberBridge(Number no) {
		this.number = no;
	}

	public abstract String getNumber();
}

class NumberString extends NumberBridge {

	public NumberString(Number no) {
		super(no);
	}

	@Override
	public String getNumber() {
		return String.valueOf(number.getNumber());
	}

}
