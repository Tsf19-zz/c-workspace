package com.java.trick;

import java.util.Scanner;

public class PrintEvenOddWithoutCondition {

	public static void main(String[] args) {
		String[] arr = {"Even","Odd"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("The Number "+n+" is "+arr[n%2]);
		
	}

}
