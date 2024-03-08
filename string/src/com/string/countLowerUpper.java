package com.string;

public class countLowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="SAIthejaSRI";
		int Ucount=0;
		int Lcount=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				Ucount++;
			}
			else if(ch>='a'&& ch<='z')
			{
				Lcount++;
			}
			else
				System.out.println("please enter the string to count the upper and lower case characters in string");;
		}	
		System.out.println(Ucount);
		System.out.println(Lcount);
		 }

	 }


