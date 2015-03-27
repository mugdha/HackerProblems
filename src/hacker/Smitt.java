package hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Smitt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 System.out.println(IsPrimeNum(num));
		 
	}
	 public ArrayList<Integer> primeFactor(int a)
	 {
		 ArrayList<Integer> primefactor=new ArrayList<Integer>();
		 
		 int squarRoot=(int) Math.sqrt(a);
		 // find the list of all the prime number less tha
		 
		 while(a>1)
		 {
			 if(IsPrimeNum(a))   // check if a is prime or composite if true a is prime number itself.. add it to arraylist
			 {
				 primefactor.add(a);
				 a=a/a;
			 }
			 else                      // composite number
			 {
				  
			 }
		 }
		return primefactor;
		 
	 }
	 static boolean IsPrimeNum(int a)
	 {
		 if(a==1 || a ==0)
			 return false;
		 if(a==2)
			 return true;		 
		 int sqtr=(int) Math.sqrt(a);
		 for(int i=2;i<=sqtr;i++)
		 {
			 if(a/i==0)
				 return false;
		 }
		 return true;
	 }

}
