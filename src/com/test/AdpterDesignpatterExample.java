package com.test;

public class AdpterDesignpatterExample {

	public static void main(String[] args) {
		Socket socket = new Socket();
		socket.getVolts().setVolatage(12);
		//System.out.println("Volts: " + socket.getVolts().getVolatage());
		
		
		SocketAdapter s = new SocketclassAdapterImpl();
		System.out.println(s.getVolts().getVolatage());
		System.out.println(s.get3Volts().getVolatage());
		System.out.println(s.get12Volts().getVolatage());
	}
}


class Volt{
	private int volatage;
	
	public Volt(){
		volatage = 120;
	}
	
	public Volt(int v){
		this.volatage = v;
	}

	public int getVolatage() { 	return volatage; }

	public void setVolatage(int volatage) { this.volatage = volatage; }
	
}


class Socket {

	public Volt getVolts() { return new Volt(); }
	
}


interface SocketAdapter{ 
	public Volt getVolts();
	public Volt get3Volts();
	public Volt get12Volts();
}

class SocketclassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt getVolts() {
		return super.getVolts();
	}

	@Override
	public Volt get3Volts() {
		return convertVolt(40);
	}


	@Override
	public Volt get12Volts() {
		return convertVolt(10);
	} 	
	
	private Volt convertVolt(int i) {
		Volt v = getVolts();
		return new Volt(v.getVolatage()/i);
	}
}
