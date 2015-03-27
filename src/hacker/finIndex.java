package hacker;

import java.util.Scanner;

public class finIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int valToFind=sc.nextInt();
		sc.nextLine();	 
		int len=sc.nextInt();
		sc.nextLine();
		String sortedArra=sc.nextLine();		 
		String part[]=sortedArra.split(" ");
		int intArra[]=new int[len];
		for (int i = 0; i < intArra.length; i++) {
			intArra[i]=Integer.parseInt(part[i]);
		}
		for (int i = 0; i < intArra.length; i++) {
			if(intArra[i]==valToFind)
				{
				System.out.println(i);
				System.exit(0);
				}
		}
		
	}

}
