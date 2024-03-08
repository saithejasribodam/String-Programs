package com.string;

public class CountChar {
public static void main(String[] args) {
	String str="Saitheja@#$%^2030";
	int Ucount=0, Lcount=0, Scount=0,num=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z')
		
			Ucount++;
		else if(ch>='a' && ch<='z')
			Lcount++;
		else if(ch>='0' && ch<='9')
			num++;
		else
			Scount++;
	}
	System.out.println("Ucount" +Ucount);
	System.out.println("Lcount"+Lcount);
	System.out.println("Scount"+Scount);
	System.out.println("num"+num);

}
}
