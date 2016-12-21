package com.test;
class A
{

 int i = 10;
 
 String methodtest(){
	 
return "Class a method test";
		}

public String methodtest() {
	// TODO Auto-generated method stub
	return null;
}
}
 
class B extends A
{

 int i = 20;
 
 String methodtest(){
	 
return "Class B method test";
		}
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
        System.out.println(a.methodtest());
    }
}