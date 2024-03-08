package com.string;

public class vowels {
public static void main(String[] args) {
//	String name="education";
//
//	name=name.toLowerCase();
//	for(int i=0;i<name.length();i++)
//	{
//		char ch=name.charAt(i);
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
//		{
//			System.out.println(ch);
//		
//	 }
//	}
int i=1,k=0;
int count =0;
int n=22;
while(i<n)
{
	if(n%i==0)
	{
		System.out.println(i);
		count++;
	}
	i++;
}
//System.out.println("the factors are" +k);
System.out.println("count ="+count);
}
	
}
