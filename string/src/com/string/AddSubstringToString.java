package com.string;
import java.util.*;
import java.lang.*;
public class AddSubstringToString
{
	public static void main(String[] args)
	{
//String name="india";
//String toadd="country";
//String newname=new String();
//int index=0;
//String[] strarray=new String[] {name};
//String[] strarray1=new String[] {toadd};
//String[] newnamearray=new String[] {newname};
//String newstr="";
//for(int i=0;i<strarray.length;i++)
//{
//if(i==3)
//{
//	for(int j=0;j<=toadd.length()-1;j++)
//	{
//		newnamearray[index++]=strarray1[j];
//	}
//}
//else
//{
//	newnamearray[i]=strarray[i];
//}
//}
//		
//for(int i=0;i<newnamearray.length-1;i++)
//{
//System.out.print(newnamearray[i]);
//	}
StringBuffer sb=new StringBuffer("india");
sb.insert(3,"Country");
System.out.println(sb);
	}

}
