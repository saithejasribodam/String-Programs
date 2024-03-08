package com.string;
import java.util.*;
import java.lang.*;

public class OccuranceOfString {

	public static void main(String[] args) {
//String str=" i, i, i, love, love, love, india, india, inida";
//String[] s=str.split(",");
//Map<String,Integer> map=new HashMap<String,Integer>();
//for(String st:s)
//{
//	Integer old=map.get(st);
//	if(old==null)
//	{
//		old=0;
//	}
//	map.put(str, old+1);
//}
//System.out.println(map);
		String str1 = "Rolando,Rolando,Messi,Neymar,Neymar,Rolando,Messi";
        String[] str = str1.split(",");
        int count = 0;
        //String temp[] = new String[str.length];
        for(int i =0;i< str.length-1;i++)
        {
            for(int j=i+1;j< str.length;j++)
            {
                if((str[i].equals(str[j])))
                {
                    System.out.println(str[j]+" is "+count+" times");
                    count++;
                } 
            }
        }
	}

}
