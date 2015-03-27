package hacker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class splitPhoneNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcaseCount=sc.nextInt();
		sc.nextLine();
		int count=0;
		
		for (int i = 0; i < testcaseCount; i++) {
			
			String input=sc.nextLine();
			String pattern="(\\d{1,3})[-|\\s](\\d{1,3})[-|\\s](\\d{4,10})";		
					 
			Pattern p=Pattern.compile(pattern);
			Matcher m = p.matcher(input);
			System.out.println(m.groupCount());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println("CountryCode="+m.group(1)+", "+"LocalAreaCode="+m.group(2)+", "+"Number="+m.group(3));
			 
			if(m.find())
				count++;
			
			
		}
		System.out.println(count);
	}
}
