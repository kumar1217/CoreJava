package com.test;
import com.test.ConstructorTest;

public class ConstructorTest1 extends ConstructorTest {
		
		
	ConstructorTest1(){
		System.out.println("Default constructorrrrrrrrrrr  	ConstructorTest1");
	}
	
	ConstructorTest1(String s){
	super("kumar");
		System.out.println("Parameter constructor 	ConstructorTest1");	
	}

	public String test() {
		return"Yuvan";
	}
	public String test(String a){
		return "Siddu";
	}
	public static void main(String[] args) {
		
		ConstructorTest1 constructorTest = new ConstructorTest1("Yuvan");
	}
}
 