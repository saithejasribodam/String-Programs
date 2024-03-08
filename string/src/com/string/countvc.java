package com.string;

public class countvc {
public static void main(String[] args) {
	String name="education";
	int vowelcount=0;
	int ccount=0;
	name=name.toLowerCase();
	for(int i=0;i<name.length();i++)
	{
		char ch=name.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println(ch);
			vowelcount++;
		}
		else
			ccount++;
	 }
	System.out.println(vowelcount);
	System.out.println(ccount);

}
}
