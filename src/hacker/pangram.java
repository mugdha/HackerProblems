package hacker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		 Set<Character> resulrt=new HashSet<>();
		 for (int i = 0; i < input.length(); i++) {
			 int a=input.charAt(i);
			 if((a>=65 && a<=90)||(a>=97 && a<=122))
			 {
				int b=a+32;
				int c=a-32;
				char bb=(char) b;
				char cc=(char) c;
				 if(!resulrt.contains(bb)&&(!resulrt.contains(cc)))
						 {
					 resulrt.add(input.charAt(i));
						 }
			 }
			  
		}
		 if(resulrt.size()==26)
		 {
			 System.out.println("pangram");
		 }
		 else
			 System.out.println("not pangram");
	}

}
