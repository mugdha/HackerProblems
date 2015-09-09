package hacker;

import java.util.Scanner;

public class insertionSOrt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long len = sc.nextLong();
		sc.nextLine();
		String sortedArra = sc.nextLine();
		String part[] = sortedArra.split(" ");
		long intArra[] = new long[(int) len];
		for (int i = 0; i < intArra.length; i++) {
			intArra[i] = Integer.parseInt(part[i]);
		}
		SortIn(intArra);
	}

	private static void SortIn(long[] intArra) {
		 int count=0;
		
		for (int i = intArra.length-1; i > 0; i--) {
			long val = intArra[i];
			int index = i;
			for (int j = i - 1; j >= 0; j--) {
				if (val > intArra[j]) {
					intArra[index] = val;
					count++;

				} else {
					// swap=true;
					intArra[j + 1] = intArra[j];
					index = j;
				}
				if(count<2)
				{
				for (int k = 0; k < intArra.length; k++) {
					System.out.print(intArra[k]+" ");
				}
				System.out.println("");
				}
			}
		}
	}

}
