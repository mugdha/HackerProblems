package hacker;

import java.util.Scanner;

public class alternateChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	sc.nextLine();
	if(T>0 && T<=10){
		for (int k = 0; k < T; k++) {
			String input=sc.nextLine();
			int del=0;
			int indexTaken=0;
			StringBuffer inpt=new StringBuffer(input.charAt(0));
			for (int i = 1; i < input.length();i++) {
				if(input.charAt(indexTaken)==input.charAt(i))
				{
					del++;
				}
				else
				{
					inpt.append(input.charAt(i));
					indexTaken=i;
				}
			}
			System.out.println(del);
			
		}	
		
	}
	
}
}
