package com.java.cts;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void checkNumberIsArmstrong() {
		
		int n, a, i = 0, j = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		n = input.nextInt();
		a = n;
		while (a>0) {
			
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	
	}
}
