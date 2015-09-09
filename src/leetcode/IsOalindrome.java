package leetcode;

import java.util.Scanner;

public class IsOalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println(isPalindrome(val));

	}

	// checking palindrome without extra space
	public static boolean isPalindrome(int x) {
		String val = Integer.toString(x);
		boolean flag = true;

		int j = val.length() - 1;
		for (int i = 0; i < val.length() / 2; i++) {
			if (val.charAt(i) != val.charAt(j--)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	

	public static boolean isPalindrome1(int x) {
		int revr = reverse(x);
		if (revr - x == 0)
			return true;
		else
			return false;

	}

	public static int reverse(int x) {

		int reverse = 0;
		int temp;
		while (x > 0) {
			temp = x % 10;
			x = x / 10;
			reverse = reverse * 10 + temp;
		}
		return reverse;
	}

}
