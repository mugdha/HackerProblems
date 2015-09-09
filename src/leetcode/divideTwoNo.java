package leetcode;

import java.util.Scanner;

public class divideTwoNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		divideTwoNoMethid(a, b);
	}

	public static void divideTwoNoMethid(int dividend, int diviso) {
		int que=0;
		while (dividend > diviso) {
			dividend=dividend-diviso;
			que++;
		}
		System.out.println("Quotient="+que+" remainder=="+dividend);
	}
}
