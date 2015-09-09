package hacker;

import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int freq[][] = new int[2][26];
		
		for (int j = 0; j < 2; j++) {			 
			String input = sc.nextLine();
			if(input.length()>=1 && input.length()<=10000){
			for (int i = 0; i < input.length(); i++) {
				int a = input.charAt(i);
				int pointer = a - 97;
				freq[j][pointer]++;
			}
			}
			else
				System.exit(1);
		}
		int del=0;
		for (int i = 0; i < 26; i++) {	 
			if(freq[0][i]!=freq[1][i])
				{	
					 int min=Math.abs(freq[0][i]-freq[1][i]);
					 del=del+min;		
					
				}
				  
		}
		System.out.println(del);
	}
}
