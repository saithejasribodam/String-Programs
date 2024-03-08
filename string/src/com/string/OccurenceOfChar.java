package com.string;

public class OccurenceOfChar {

	public static void main(String[] args) {
		 String str="saithejasri";
	     String taken="";
	     for(int j=0;j<=str.length()-1;j++)
	     {
	char k=str.charAt(j);
	if(taken.indexOf(k)==-1)
	{
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		if(ch==k)
			count++;
	}
	System.out.println(k+"occured for"+count+"times");
	taken=taken+k;
	}
	}
	}
}

