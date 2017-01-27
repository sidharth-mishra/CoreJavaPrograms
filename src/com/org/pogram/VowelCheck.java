package com.org.pogram;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getVowelCheck("How many vowels in this String");
	}

	
	
				public static void  getVowelCheck(String input){
					
					
					
					char[] ch=input.toCharArray();
					int count=0;
			            for (char c : ch) {
			         switch(c){   	
			            case 'a':
			            	case 'e':
			            		case 'i': 
			            			case 'o': 
			            				case 'u':
			            					
			            	   count++;
			            	   break;
			         }

			            				}	
			            
			            System.out.println("Given: "+input+"  :"+count);
					
				}
}
