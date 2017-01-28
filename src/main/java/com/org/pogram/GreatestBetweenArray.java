package com.org.pogram;

public class GreatestBetweenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]x={3,5,2,1,7,6,4};
		
		
		
		int temp=0;
		for(int i=0;i<x.length;i++){
			
			for(int j=i+1;j<x.length;j++){
				if(x[i]<x[j]){
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			
		}
		System.out.println(x[0]);
		
		

	}
	
	

}
