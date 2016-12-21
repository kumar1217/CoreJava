package com.test;

import java.util.Scanner;

public class Trainglepyramid {

	public static void main(String[] args) {
		//System.out.println("*");
		Scanner scanner = new Scanner(System.in);
	int n=	scanner.nextInt();

	int count =1;
	for (int i=0;i<n;i++){ // 1st n=4,i=0; 2)
	
		for(int j=0;j<count;j++){
			System.out.print("*");
		}

		count=count+2;
		System.out.println();
	}
	}
}