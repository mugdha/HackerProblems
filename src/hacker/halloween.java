package hacker;

import java.util.Scanner;

public class halloween {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCaseCOunt=sc.nextInt();
		if(testCaseCOunt>0 && testCaseCOunt<=10)
		{
			for (int i = 0; i < testCaseCOunt; i++) {
				long input=sc.nextLong();
				long val1=input/2;
				long val2=(input-val1);
				long maxVal=val1*val2;
				System.out.println(maxVal);	
				
			}
		}
	}

}
