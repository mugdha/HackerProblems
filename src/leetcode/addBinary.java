package leetcode;

import java.util.Scanner;

public class addBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		Integer sum=Integer.parseInt(s1, 2)+Integer.parseInt(s2, 2);
		String output=Integer.toBinaryString(sum);
		System.out.println(s1+"+"+s2+":"+output);
	}

}
