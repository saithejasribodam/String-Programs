package com.string;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="123theja456";
     int sum=0;
     for (int i=0;i<str.length();i++)
     {
    	 char ch=str.charAt(i);
    	 if(ch>='0' && ch<='9')
    	 {
    		sum=sum+(ch-48); 
    	 }
     }
     System.out.println(sum);
	}

}
