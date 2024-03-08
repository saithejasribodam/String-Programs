package com.string;

public class OddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="samantha";
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(name.charAt(i));
			}
					
		}

	}

}
