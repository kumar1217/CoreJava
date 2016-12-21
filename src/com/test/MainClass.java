package com.test;
class A1
{

 int i = 10;
 
 String methodtest1(){
	 
return "Class a method test";
		}

public String methodtest() {
	// TODO Auto-generated method stub
	return null;
}
}
 
class B extends A1
{

 int i = 20;
 
 String methodtest1(){
	 
return "Class B method test";
		}
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A1 a = new B();
 
        System.out.println(a.i);
        System.out.println(a.methodtest1());
    }
}