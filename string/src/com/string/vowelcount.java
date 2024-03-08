package com.string;

public class vowelcount {
public static void main(String[] args) {
	String name="education";
	int count=0;
	name=name.toLowerCase();
	for(int i=0;i<name.length();i++)
	{
		char ch=name.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println(ch);
		count++;
		}
	 }
	System.out.println(count);
}
}
