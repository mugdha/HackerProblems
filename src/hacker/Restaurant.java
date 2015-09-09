package hacker;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		
		
		System.out.println(noOfBreadCut(38));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		if(T>=1 && T<=1000)
		{
			for(int i=0;i<T;i++){
			int l=sc.nextInt();
			int b=sc.nextInt();
			if(l>=1 && l<=1000 && b>=1 && b<=1000) 
			{
				int max=Math.min(l, b);
				if(l==b)
				{
					System.out.println(noOfBreadCut(l-1));
				}
				else
				{
					System.out.println(noOfBreadCut(max));
				}
			}
			}
		}
			
	}
	
	static int noOfBreadCut(int a)
	{
		int sum=1;
		
		for (int i = 1; i <= a; i++) {
			int temp=i*i;
			sum*=i;			
		}	
		
		return sum;
		
	}
	
	

}
