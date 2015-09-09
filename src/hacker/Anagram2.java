package hacker;

import java.util.Scanner;

public class Anagram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		if(T>=1 && T<=100)
		{
			for (int i = 0; i < T; i++) {

				int freq1[] = new int[26];
				int freq2[] = new int[26];
				String S=sc.nextLine();
				if(S.length()%2!=0)
					System.out.println(-1);
				else
				{
					String s1=S.substring(0, S.length()/2);
					String s2=S.substring(S.length()/2);
					for (int j = 0; j < s1.length(); j++) {
						int a = s1.charAt(j);
						int pointer = a - 97;
						freq1[pointer]++;
					}
					for (int j = 0; j < s2.length(); j++) {
						int a = s2.charAt(j);
						int pointer = a - 97;
						freq2[pointer]++;
					}
					int changeReq=0;
					for (int j = 0; j < 26; j++) {
						if(freq1[j]!=freq2[j]&& freq1[j]!=0)
						{
							if(freq1[j]>freq2[j])
							{
								int dif=Math.abs(freq1[j]-freq2[j]);
								changeReq+=dif;
							}
							
						}
					}
					System.out.println(changeReq);
				}
			}			
			
		}
		
	}

}
