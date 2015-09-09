package leetcode;

import java.util.Scanner;

public class factorialTrail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getfactonailZero(n));
	}
	public static int getfactonailZero(int n)
	{
		int count=0;
		for (int i = 5; i <= n;) {
			count+=n/i;
			i=i*5;
		}
		System.out.println(count);
		return count;
	}

}
