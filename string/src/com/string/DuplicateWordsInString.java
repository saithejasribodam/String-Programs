package com.string;

import java.util.*;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		 String str
         = "Hi, java is cool java is functional";

     // splitting words using regex
     String[] words = str.split("\\W");

     // creating object of HashSet class implemented by
     Set<String> set = new HashSet();
//int count=0;
     // here we are iterating in Array
     for (int i = 0; i < words.length - 1; i++) {

         for (int j = 1; j < words.length; j++) {

             // if strings matched then adding strings in
             // Set because if we ad same string set will
             // remove one and we have only repeated
             // words.
             if (words[i].equals(words[j]) && i != j) {
                 set.add(words[i]);
//                 count++;
             }
         }
     }

     // here we are printing the set
     System.out.println(set);
//     System.out.println(count);
 }


}
