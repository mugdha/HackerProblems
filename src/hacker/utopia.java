package hacker;

import java.util.Scanner;

public class utopia {
	public static void main(String[] args) {
		//enter the number of times u want to run these testcase
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		// initial height of the tree is 1 m
		int testCaseCOunt=sc.nextInt();
		for (int i = 0; i < testCaseCOunt; i++) {
			int val=sc.nextInt();
			System.out.println(getUtopica(val));			
		}
		
		
		
	} 
	public static int getUtopica(int N)
	{
		
		if(N==0)
			return 1;
		else
		{ 
			if(N%2==0) // even number
				return getUtopica(N-1)+1;
			else
				return 2*getUtopica(N-1);
		}
		 
	}

}
