package hacker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hackrank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcaseCount=sc.nextInt();
		sc.nextLine();
		int count=0;
		
		for (int i = 0; i < testcaseCount; i++) {
			
			String input=sc.nextLine();
			String pattern="(.*)(H|h)(a|A)(c|C)(k|K)(e|E)(r|R)(r|R)(a|A)(n|N)(k|K)(.*)";
			Pattern p=Pattern.compile(pattern);
			Matcher m = p.matcher(input);
			if(m.find())
				count++;
			
			
		}
		System.out.println(count);
	}
}
