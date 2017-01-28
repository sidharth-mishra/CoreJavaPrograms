package com.org.pogram;

import java.util.HashMap;
import java.util.TreeMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate rm=new  RemoveDuplicate();
	//String sm=	
			rm.getOriginalString("i go to school and my school is near to my home");
	//System.out.println(sm);

	}
	
	
	public void
	getOriginalString(String input){
	String originalOutput="";	
	String[] splitData=	input.split(" ");
	
	HashMap<String ,Integer> hs=new HashMap<String, Integer>();
	
	for (String str1 : splitData) {
		
	if(hs.containsKey(str1)){
		hs.put(str1, hs.get(str1)+1);
		
	}
	else{
		hs.put(str1,1);
		originalOutput+=str1+" ";
	}
		
	}
	
	
	
	
	//return originalOutput;
	
	
/*	for (String st : originalOutput.split("")) {
		if(hs.get(st)>=1)
		System.out.println(st+": "+hs.get(st));
	}
	*/
	 
	TreeMap<String, Integer> tm=new TreeMap<String, Integer>(hs);
	
	
		
		System.out.println(tm);
		
	}

}
