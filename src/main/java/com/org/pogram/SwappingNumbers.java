package com.org.pogram;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 swapTwoNumbers(5,6);
	
	}

	
	public static void swapTwoNumbers(int a,int b){
		
		System.out.println("Before Swapping: "+"a :"+a+" "+"b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: "+"a: "+a+" "+"b: "+b);
	}
}
