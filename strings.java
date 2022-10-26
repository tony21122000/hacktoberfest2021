package com.test.wordLine;
import java.util.Scanner;
public class WordLine {
	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String str =s.nextLine();
        System.out.println("your sentence is :");
        String[] b=str.split(" ");
         		for(i=0;i<=b.length;i++)
                 {
        	        	System.out.println(b[i]);  
			 }
		}
}
