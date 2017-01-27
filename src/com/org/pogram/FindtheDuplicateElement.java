package com.org.pogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class FindtheDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<Character,Integer> mq=	getDuplicate("ssiidharth");
		
		 for (Character ch : mq.keySet()) {
			 
			 System.out.println(ch+".."+mq.get(ch));
			
		}
	

	}
	
	
	private static Map<Character,Integer> getDuplicate(String value){
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
	    char[] ch=	value.toCharArray();
		for(int i=0;i<ch.length;i++){
			
			if(mp.containsKey(ch[i])){
				mp.put(ch[i],mp.get(ch[i])+1);
			}
			
			else{
				mp.put(ch[i], 1);
			}
			
			
		}
		
		for(int i=0;i<ch.length;i++){
		char c=	value.charAt(i);
		
		if(mp.get(c)>1){
			mp.remove(c);
			break;
		}
		}
		return mp;
        
        
        
	}

}
