package hacker;

import java.util.Scanner;

public class findDigit {
	public static void main(String[] args) {
		
	 
		Scanner sc=new Scanner(System.in);
		int testCaseNo=sc.nextInt();
		
		if(testCaseNo>0 && testCaseNo<16)
		{
		for (int i = 0; i < testCaseNo; i++) {
			int input=sc.nextInt();
			System.out.println(getDigitcount(input));
		}
		}
	}

	private static int getDigitcount(int input) {
	  
		int temp=input;		 
		int digitCount=0;
		while(true)
		{
			int a=temp%10;
			temp=temp/(10);
			if(a==0)
				continue;
			else if(input%a==0)
				digitCount++;		 
			if(temp<1)			 
				return digitCount; 
			
		}
		
	}

}
