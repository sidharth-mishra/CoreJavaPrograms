package com.org.pogram;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromNumber pd=new PalindromNumber();
	System.out.println(pd.isPalindrom("MADAM"));	
	}
public boolean isPalindrom(String value){
 char[] ch=	value.toCharArray();
 boolean ispal=true;
 int n=ch.length-1;
 for(int i=0;i<ch.length/2;i++){
	if( ch[i]!=ch[n]){
		ispal=false;
		
	}
	n--;
 }
 
 return ispal;
}
}
