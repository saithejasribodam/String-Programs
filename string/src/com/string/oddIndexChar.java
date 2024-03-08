package com.string;

public class oddIndexChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="samantha";
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++)
		{
			if(i%2==1)
			{
				System.out.println(name.charAt(i));
			}
					
		}

	}

}
