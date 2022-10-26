package com.test.revString;
import java.util.Scanner;
public class RevString {
	public static void main(String[] args) {
		System.out.println("Enter string :"); 
		 Scanner s = new Scanner(System.in);
		 String str = s.nextLine();
		 String rev = "";
		 for(int i = str.length() - 1; i >= 0; i--)
		 {
		 rev = rev + str.charAt(i);
		 }
            System.out.println("Reversed string :");
		 System.out.println(rev);
		}
		}
