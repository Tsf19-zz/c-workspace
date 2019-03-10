package com.java.basic;

import java.util.Scanner;

class LcmHcfCalculator{
	public static long findLcm(int[] ar) {
		
		int[] a=ar.clone();
		long lcm=1;
		int divisor=2;
		while(true) {
			int count=0;
			boolean divisible=false;

			for(int i=0;i<a.length;i++) {
				if(a[i]==0)
					return 0;
				if(a[i]<0)
					a[i]=a[i]*(-1);
				if(a[i]==1)
					count++;

				if(a[i]%divisor==0) {
					divisible=true;
					a[i]=a[i]/divisor;
				}
			}

			if(divisible) {
				lcm=lcm*divisor;
			}
			else
				divisor++;

			if(count==a.length)
				return lcm;

		}
	}

	static int hcf(int a, int b) {
		if(a==0)
			return b;
		return hcf(b%a, a);
	}

	public static int findHcf(int[] a) {
		int result=a[0];
		for(int i=1; i<a.length; i++)
			result=hcf(a[i], result);

		return result;

	}


}



public class LCM_HCF {
	public static void main(String[] args) {

		System.out.println("Enter How Many Numbers ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n]; 
		for(int i=0;i<n;i++) {
			System.out.println("Enter Numbers ");
			a[i] = scan.nextInt();
		}
		System.out.println("LCM is : "+LcmHcfCalculator.findLcm(a));

		System.out.println("HCF is : "+LcmHcfCalculator.findHcf(a));

	}

}
