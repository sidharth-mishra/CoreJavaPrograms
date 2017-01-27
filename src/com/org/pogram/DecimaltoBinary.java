package com.org.pogram;

import java.util.Stack;

public class DecimaltoBinary {
	
public static void main(String[] args) {
	
	
	int num=999;
	
	Stack st=new Stack<Integer>();
while(num!=0){
	
	int rem=num%2;
	st.push(rem);
	num=num/2;
		
	}


while(!(st.isEmpty())){
	System.out.print(st.pop());
	
}
	
}	
	
}
