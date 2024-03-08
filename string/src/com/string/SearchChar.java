package com.string;

public class SearchChar {
public static void main(String[] args) {
	String str="theja";
	str=str.toLowerCase();
	char ch='T';
	for(int i=0;i<str.length();i++)
	{
		char chh=str.charAt(i);
		if(ch==chh)
		{
			System.out.println("found");
		    return;
		}
	}

			System.out.println("not found");
	}
}

