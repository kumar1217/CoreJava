package com.test;

public class ExceptionTest {

	public static void main(String[] args) {

ExceptionTest e=new ExceptionTest();
System.out.println(e.div(10, 0));
	}
	
	int div(int a ,int b){
	
		try{
			
			int c=a/b;
		}catch(Exception e){
			
			System.out.println("we are in catch..."+e.getMessage());
			return 10;
			
		}finally{
			System.out.println("we are in finnaly block");
			return 10000;
		}

		
	}

}
