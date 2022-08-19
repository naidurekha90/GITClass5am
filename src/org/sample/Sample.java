package org.sample;

public class Sample {

	public static void main(String[] args) {
		
		String s =  "Computer Programming 123";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			//to fetch particular character 
			
			//System.out.println(ch);
			
			if (ch=='m') {
				
				System.out.println(ch);
				//duplicates m character would be fetched in console 
				
				System.out.println(i);
				
			}
			
		}
		
	}
}
