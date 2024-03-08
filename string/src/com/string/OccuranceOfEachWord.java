package com.string;
import java.io.*;
import java.util.Scanner;
public class OccuranceOfEachWord {

	public static void main(String[] args) {
		
		
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter a string : ");
		        String str = scanner.nextLine();
		        
		        //Splitting the string by space and storing into string array
		        String strArray[] = str.split(" ");
		        
		        for(int i=0;i<strArray.length;i++) {
		            int count=0;
		            for(int j=0;j<strArray.length;j++) {
		                
		                //Storing the string value into temporary variable
		                String temp1 = strArray[i];
		                String temp2 = strArray[j];
		                
		                /*if second loop encounter same value again but j<i break the loop to 
		                avoid printing of duplicate value*/
		                if(j<i && temp1.equals(temp2)) {
		                    break;
		                }
		                
		                //if second loop encounter same value increase the value of count
		                if(temp1.equals(temp2)) {
		                    count++;
		                }
		                
		                /*While traversing the array, if loop reached to last print the
		                string with its number of count*/
		                if(j==strArray.length-1) {
		                    System.out.println(strArray[i]+" "+count);
		                }
		            }
		        }
		    }
		

}
