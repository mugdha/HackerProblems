package hacker;

import java.util.Scanner;

public class timeInWord {
	static String[] numNames = { "", "one", "two", "three", "four",
		"five", "six", "seven", "eight", "nine", "ten", "eleven",
		"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
		"seventeen", "eighteen", "nineteen" };
static String[] tensNames = { "", "ten", "twenty","thirty" };

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int hour=sc.nextInt();
	int min=sc.nextInt();		
	if(hour>0 && hour<=12)
	{
		if(min>=0&&min<60)
		{
			String hr;
			String minute;
			
			if(min<=30)	{
				hr=convertLessThanOneThousand(hour);
				minute=convertLessThanOneThousand(min);
				 
				if(min==30)
				{
					System.out.println("half past"+" "+hr);
				} else if(min==0)
				{
					System.out.println(hr+" "+"o' clock");
				}
				else
					System.out.println(minute+" "+"minute past"+" "+hr);
			}
			else
			{
				int rem=60-min;
				hr=convertLessThanOneThousand(hour+1);
				minute=convertLessThanOneThousand(rem);
				if(rem==15)
				{
					System.out.println("quarter to"+" "+hr);
				}
				else
				{
					System.out.println(minute+" "+"minutes to"+" "+hr);
				} 
				
			}

		}
	}
}
	

private static String convertLessThanOneThousand(int number) {
	String soFar;

	if (number % 100 < 20) {
		soFar = numNames[number % 100];
		number /= 100;
	} else {
		soFar = numNames[number % 10];
		number /= 10;

		soFar = tensNames[number % 10] + soFar;
		number /= 10;
	}
	if (number == 0)
		return soFar;
	return numNames[number] + " hundred" + soFar;
}


}
