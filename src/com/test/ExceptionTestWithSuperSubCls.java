package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTestWithSuperSubCls {

	public static void main(String[] args) {
SubB b=new SubB();
b.sleep();

	}

}
class SupA{
	public void sleep() {
		System.out.println("am A class sleep");
	}
}
class SubB extends SupA{
	public void sleep()  {
		System.out.println("am Subb class sleep");
	}
}