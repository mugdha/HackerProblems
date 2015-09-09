import java.util.Scanner;


public class spaceRemoval {
public static void main(String1[] args) {
	Scanner sc=new Scanner(System.in);
	String1 s=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	 
	for (int i = 0; i < s.length(); i++) {
		
		int space=s.charAt(i);
		if(space==32)
			sb.append("%20");
		else
			sb.append(s.charAt(i));	 
		
	}
	System.out.println(sb.toString());
}
}
