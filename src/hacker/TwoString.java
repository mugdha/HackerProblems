package hacker;

import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		if (T >= 1 && T <= 10) {
			for (int k = 0; k < T; k++) {		 

			String a1 = sc.nextLine();
			String a2 = sc.nextLine();
			Boolean flag = false;
			Boolean flag2=false;
			for (int i = 0; i < a1.length(); i++) {

				for (int j = 0; j < a2.length(); j++) {
					if (a1.charAt(i) == a2.charAt(j)) {
						flag = true;
						flag2=true;
						break;
					}
				}
				if(flag2)
					break;
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
	}
}
