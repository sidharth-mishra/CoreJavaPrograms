package com.org.pogram;

import java.util.HashMap;
import java.util.Map;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer,Integer> map1=getLcm(30);
	//System.out.println(hm);
	Map<Integer,Integer> map2= getLcm(45);
	//System.out.println(mp);
	for (Integer key : map1.keySet()) {
		if(map2.containsKey(key)){
			
			if(map1.get(key)>map2.get(key)){
				map2.put(key, map1.get(key));
			}
			
			
		}
		else{
			map2.put(key, map1.get(key));
		}
		
	}
	System.out.println(map2);
	int lcm=1;
	
	for (Integer key : map2.keySet()) {
		
/*	int values=	map2.get(keyvalue);
			
      lcm= lcm*keyvalue*values;	*/	
		
		for(int count=1;count<=map2.get(key);count++){
			lcm = lcm*key;
		}
	}
	System.out.println(lcm);
	/*
	Map<Integer,Integer> mp2= getLcm(27);
	System.out.println(mp2);*/
	
	}
	
	
	
	
	private static Map<Integer,Integer> getLcm(int number){
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	//	int temp=number;
		for(int i=2;i<=number;i++){
			
			//int rem=number%i;
			if(number%i==0){
				
				
				
				if(hm.containsKey(i)){
					int existingVal = hm.get(i);
					existingVal++;
					hm.put(i,existingVal);
				}else{
					hm.put(i,1);
				}
				number=number/i;
				i=2;
			}
			
			
			
		}
		return hm;
		
	}

}
