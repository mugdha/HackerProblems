import java.util.Scanner;

public class duplicateREmovale {
	public static void main(String1[] args) {
		String1 s = "mugdhakanni";
		char[] a = s.toCharArray();
		removeDuplicates(a);
	}

	public static void removeDuplicates(char[] str) {

		int len = str.length;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				System.out.println(str.toString());
				++tail;
			}
		}
		str[tail] = 0;
		System.out.println(str.toString());
	}
}
