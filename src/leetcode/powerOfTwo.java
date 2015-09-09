package leetcode;

import java.util.Scanner;

public class powerOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int temp=input;
		while(temp%2==0)
		{
			temp=temp/2;
		}
		if(temp!=1)
		{
			System.out.println("not a power of 2");
		}
		else
		{
			System.out.println("power of 2");
		}
	}

}
