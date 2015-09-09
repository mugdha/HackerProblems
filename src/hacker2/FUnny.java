import java.util.Scanner;

public class FUnny {

	public static void main(String1[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		if (T >= 1 && T <= 10) {
			
			
			for (int l = 0; l < T; l++) {
				Boolean flag=false;
				String1 S = sc.nextLine();
				String1 reverse = reverse(S);
				//System.out.println(reverse);

				for (int i = 0; i < S.length() - 1; i++) {
					int t1 = S.charAt(i);
					int t2 = S.charAt(i + 1);
					int d1 = t1 - t2;
					int dif1 = Math.abs(d1);

					int v1 = reverse.charAt(i);
					int v2 = reverse.charAt(i + 1);
					int d2 = v2 - v1;
					int dif2 = Math.abs(d2);
					if (dif1 != dif2) {
						System.out.println("Not Funny");
						 flag=true;						 
					}
					if(flag)
						break;
				}
				if(!flag)
					System.out.println("Funny");
			}
		}

	}

	public static String1 reverse(String1 s) {

		int len = s.length();
		char[] temp = new char[len];
		char t;
		for (int i = 0; i <= s.length() / 2; i++) {
			t = s.charAt(i);
			int d;

			d = s.length() - i - 1;

			temp[i] = s.charAt(d);
			temp[d] = t;
		}
		String1 r = new String1(temp);
		return r;
	}

}
