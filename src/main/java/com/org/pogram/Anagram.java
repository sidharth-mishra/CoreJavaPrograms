package com.org.pogram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////////////////////////test at anagram///////////
		
		////hello//////
	boolean checkValue=	checkAnagram("army","sary");
	System.out.println(checkValue);
		

	}
	
	
	public static boolean checkAnagram(String str1,String str2){
		boolean isAnagram=true;
		for(int i=0;i<str1.length();i++){
			boolean match=false;
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
				 match=true;
				}
				
				
			}
			
			if(!match){
				isAnagram=false;
				break;
			}
		}
		
		return isAnagram;

		
	}

}
