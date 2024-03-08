package com.string;

public class AddSubstringwithoutfunctiontestclass {
	 public static void main(String[] args)
	    {
	  
	        // Get the Strings
	        String originalString = "GeeksGeeks";
	        String stringToBeInserted = "For";
	        int index = 4;
	  
	        System.out.println("Original String: "+ originalString);
	        System.out.println("String to be inserted: "+ stringToBeInserted);
	        System.out.println("String to be inserted at index: " + index);
	                          
	  
	        // Insert the String
	        System.out.println("Modified String: "+ AddingSubstringToStringWithoutFunctions.insertString(originalString,stringToBeInserted, index));
	    }
}
