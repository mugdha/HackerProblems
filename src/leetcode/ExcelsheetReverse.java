package leetcode;

import java.util.Scanner;

public class ExcelsheetReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < 10; i++) {
		int val=sc.nextInt();
		excelsheetReverserMeth(val);
	}
	
}
public static void excelsheetReverserMeth(int val)
{
	String out=new String();
	int remainder=val;
	int quotient=val;	 
	while(quotient>0)
	 {
		remainder=val%26;
		quotient=val/26;		
		val=quotient;
		if(remainder==0)
			remainder=26;
		char asci=(char) (remainder+64);
		out=asci+out;
	}
	 
	System.out.println(out);
}
}
