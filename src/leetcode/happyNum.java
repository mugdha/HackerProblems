package leetcode;

import java.util.Scanner;

public class happyNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		calculateHappyNo(input);
	}
	public static void calculateHappyNo(int val)
	{
		
		while(val>10){
		int sum=0;
		int que=0;
		int rem=0;
		int temp=val;
		while(temp>0 || que>0)
		{
			rem=temp%10;
			que=temp/10;
			sum+=Math.pow(rem, 2);
			temp=que;
			
		}
		val=sum;
		if(val<10)
		{
			System.out.println("Happy number");
			System.exit(0);
		}
		}
	}

}
