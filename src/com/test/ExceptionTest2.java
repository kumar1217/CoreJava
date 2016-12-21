package com.test;
public class ExceptionTest2 {
	
	String str="Kumar";
	
	
	ExceptionTest2(String s){
		 System.out.println(str);
		str=s;
		 //System.out.println(str);
	}
	public static void main(String[] args) {
		String str1="Kumar";
	str1=str1.concat("Raj");
		
		ExceptionTest2 ee=new ExceptionTest2("iii");
		ee.change();
		
		
		 System.out.println(ee.str);
	}
 void change(){
	 
	 System.out.println(str);
		}

}