package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are
 ugly while 14 is not ugly since it includes another prime factor 7.
 */

public class uglyNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		getprimeNo(input);

	}

	public static void getprimeNo(int a) {
		//int tmp=a;
		ArrayList<Integer> primeNo = new ArrayList<Integer>();
		if (a % 2 == 0) {
			primeNo.add(2);
		}
		 
		int temp = 0;
		while (a % 2 == 0) {
			temp = a / 2;
			a = temp;
		}
		for (int i = 3; i <= a; i = i + 2) {
			if (a % i == 0) {
				primeNo.add(i);
			}
		}
		if(primeNo.size()>3){
			System.out.println("No a ugly number");
			System.exit(0);}
		else 
		{
			for (Iterator iterator = primeNo.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if(integer==2||integer==3||integer==5)
					continue;
				else
					{
					System.out.println("Not a ugly number");
					System.exit(0);
					}
				
			}
			System.out.println("ugly number");
		} 
	}
	

}
