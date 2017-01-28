package com.org.pogram;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pm = new PrimeNumber();
		ArrayList<Integer> l = new ArrayList<Integer>();
		// boolean value= pm.isPrimeNumber(2);
		/*
		 * if(value){ System.out.println("is a prime number"); } else{
		 * System.out.println("is not a prime number");
		 * 
		 * }
		 */
		for (int i = 2; i < 100; i++) {
			boolean primevalue = pm.isPrimeNumber(i);
			if (primevalue == true) {
				l.add(i);
			}

		}

		for (Integer integer : l) {
			System.out.print(integer + ",");

		}
		// System.out.println(l);
	}

	public boolean isPrimeNumber(int num) {

		boolean isPrime = true;
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num / 2 + 1; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

}
