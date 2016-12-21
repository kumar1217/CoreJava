package com.test;

interface InterfaceShow {
	void show();
}

 class A  implements InterfaceShow{
	public void show() {
	System.out.println("Show A");
		
	}
}
class B1 implements InterfaceShow{

	@Override
	public void show() {
		System.out.println("Show b");
		
	}
}
public class InterfaceTest{
	public static void main(String[] args) {;
		InterfaceShow a=new A();
		a.show();
		InterfaceShow b=new B1();
		b.show();
	}
	
}