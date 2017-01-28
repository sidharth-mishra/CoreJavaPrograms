package com.org.pogram;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getReverseCheck("sidharth"));
	}

	
	public static String getReverseCheck(String input){
		
		String reverse="";
		if(input!=null  && !input.isEmpty()){
		for(int i=input.length()-1;i>=0;i--){
			reverse=reverse+input.charAt(i);
		}
		
		}
		
		else{
			reverse=reverse+"please enter a non empty string";
		}
		return reverse;
		
	}
}
