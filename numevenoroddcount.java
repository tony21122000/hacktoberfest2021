package com.test.contArray;
import java.util.Scanner;
public class CountArray {
	public static void main(String[] args) {	
		 int pos=0,even=0,odd=0,i;
		 int a[] =new int[12];
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter 12 numbers:");		   
  for(i=0; i <a.length; i++)
		     {
		         a[i]=s.nextInt();         
		         if(a[i]>0)
	             {
	                 pos++;
	             }
		         
                   if(a[i]%2==0)
		             {
		                 even++;
		             }		            
                   else
		             {
		                 odd++;
		             }
		     }
		    System.out.println("The entered numbers are:");
		        for(i = 0; i < a.length; i++){
		            System.out.print(a[i] + " ");
		        }

System.out.println("\n Count  of Positive numbers in the array: " +pos);
System.out.println( "Count  of Even numbers in the array: " +even);
System.out.println(" Count  of odd numbers in the array: " +odd);
		}
		}
