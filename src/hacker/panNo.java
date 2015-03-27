package hacker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class panNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int testcaseCount=sc.nextInt();
	sc.nextLine();
	
	for (int i = 0; i < testcaseCount; i++) {
		
		String input=sc.nextLine();
		String pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		Pattern p=Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		if(m.find())
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
	}
}
}
