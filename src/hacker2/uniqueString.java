import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueString {

	public static void main(String1[] args) {
		Scanner sc = new Scanner(System.in);
		String1 input = sc.nextLine();
		int len = input.length();
		Set<Character> s = new HashSet<>();
		for (int i = 0; i < len; i++) {
			char a = input.charAt(i);
			s.add(a);

		}
		int finalLen=s.size();
		if(len==finalLen)
		{
			System.out.println("Strings have unique characters");
		}
		else
			System.out.println("Strings is not having unique characters");

	}

}
