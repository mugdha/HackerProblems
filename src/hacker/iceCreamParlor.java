package hacker;

import java.util.Scanner;

public class iceCreamParlor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		if (T > 0 && T <= 50) {

			for (int k = 0; k < T; k++) {

				int M = sc.nextInt(); // total amount
				int N = sc.nextInt(); // total flavor

				if (M > 1 && M <= 10000 && N > 1 && N <= 10000) {

					int arr[] = new int[N + 1];
					for (int i = 1; i <= N; i++) {
						arr[i] = sc.nextInt();
					}

					// select two array elements whose sum is M

					int temp = 0;
					for (int i = 1; i < N; i++) {
						temp = arr[i];
						for (int j = i+1; j <= N; j++) {
							int sum = temp + arr[j];
							if (sum == M) {
								System.out.println(i + " " + j);
								break;
							}
						}
					}

				}
			}

		}

	}
}
