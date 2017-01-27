package com.org.pratice4ever;

import java.util.Scanner;

public class OwnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner sb=new Scanner(System.in);
		int value=sb.nextInt();
System.out.println("Check prime: "+checkPrime(value));
System.out.println("Check amstrong: "+checkAmstrong(value));
System.out.println("Check Palindrom: "+checkPalindrom(value));


	}
	
	
	
	public static boolean checkPrime(int num){
		boolean isPrime=true;
		
		for(int i=2;i<num/2+1;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
		
		
	}
	public static boolean checkAmstrong(int num){
		int total=0;
		int temp=num;
	boolean x=true;
		
		while(num>0){
			int rem=num%10;
			 total=total+rem*rem*rem;
			 num=num/10;
		}
		
if(temp==total){
	x=true;
}
else{
	x=false;
}
return x;
		
		
	}
	
	public static boolean checkPalindrom(int num){
		int total=0;
		int temp=num;
	boolean x=true;
		
		while(num>0){
			int rem=num%10;
			total=total*10+rem;
			 num=num/10;
		}
		
if(temp==total){
	x=true;
}
else{
	x=false;
}
return x;
		
		
	}
	

}
