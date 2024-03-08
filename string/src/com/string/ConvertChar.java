package com.string;

public class ConvertChar {
public static void main(String[] args) {
	String str="TheJaReddY";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		
		if(ch>='A' && ch<='Z')
		{
			ch=(char)(ch+32);
	      System.out.println(ch);
		}
		else if(ch>='a' && ch<='z')
		{
			ch=(char)(ch-32);
			System.out.println(ch);

		}
		}
}
}