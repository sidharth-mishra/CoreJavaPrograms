package com.org.pogram;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmstrongNumber am=new AmstrongNumber();
	System.out.println(am.checkAmstrongnumber(121));

	}
	
	public boolean checkAmstrongnumber(int num){
		int temp=num;
		int total=0;
        boolean z=true;		
		while(num>0){
			int x=num%10;
			total=total+x*x*x;
			num=num/10;

			
		}
		
		if(temp==total){
			z=true;
			
		}
		else{
			z=false;
		}
		
		return z;
		
	}

}
