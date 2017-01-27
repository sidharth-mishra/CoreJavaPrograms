package com.org.pogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("java", 20);
	        map.put("C++", 45);
	        map.put("Java2Novice", 2);
	        map.put("Unix", 67);
	        map.put("MAC", 26);
	        map.put("Why this kolavari", 93);
	        
	   Set<Entry<String, Integer>> st=    map.entrySet();
	   List<Entry<String, Integer>> lst=new ArrayList<Entry<String, Integer>>(st);
	   Collections.sort(lst,new Comparator<Map.Entry<String, Integer>>() {
           public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
           {
               return (o2.getValue()).compareTo( o1.getValue() );
           }
	});
	   
	   for(Map.Entry<String, Integer> entry:lst){
           System.out.println(entry.getKey()+" ==== "+entry.getValue());
       }
	}

}
