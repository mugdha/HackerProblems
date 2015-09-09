package leetcode;

import java.util.Scanner;
/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *   A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
 
public class Excel {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			String input=sc.nextLine();
			valueOfExcel(input);
		}
		
	}
	public static void valueOfExcel(String input)
	{
 
		Double sum=0d;
		int j=0;
		for (int i =input.length()-1;i>=0; i--) {
			int ascii=input.charAt(i)-64;
			Double value=Math.pow(26, j++)*ascii;
			sum+=value;
			
		}
		System.out.println(sum);
	}

}
