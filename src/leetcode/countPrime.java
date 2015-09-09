package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class countPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		countPrime(val);
	}

	public static void countPrime(int n) {
		boolean[] check = new boolean[n + 1];
		ArrayList<Integer> prime = new ArrayList<>();
		for (int i = 2; i < check.length; i++) {
			check[i] = true;
		}	 
		for (int i = 2; i < n; i++) {
			if (check[i]) {
				prime.add(i);
				for (int j = 2; j * i <= n; j++) {
					if (check[i * j]) {
						check[i * j] = false;
					}
				}
			}
		}
		int sie=prime.size();
		for (Iterator iterator = prime.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
			
		}
	}

}
