package leetcode;

import java.util.Scanner;

public class fractionTodecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();		
		 System.out.println(getRecurringValue(N,D));
		 
	}

	private static String getRecurringValue(int numerator, int denominator) {
		 String result="";
		 int quote=0;
		 int prev[]=new int[10];		 
		 int val=numerator/denominator;		  
		 result=Integer.toString(val)+'.';
		 numerator=numerator%denominator;
		 int j=0;
		 boolean flag =false;
		 while(numerator!=0 && !flag){
			     numerator=numerator*10;				  
				 quote=numerator/denominator;
				 if(quote==0)
				 {
					 result+=0;
					 continue;
				 }
				 numerator=numerator%denominator;
				 for (int i = 0; i < prev.length; i++) {
					if(quote==prev[i])
					{
						int length=result.lastIndexOf(Integer.toString(quote));
						String substring=result.substring(length);
						String newString="("+substring+")";
						String substringfront=result.substring(0,length);
						result=substringfront+newString;
						 flag=true;		
						 break;
					}
				}
				 if(!flag){
				 result+=Integer.toString(quote);
				 prev[j++]=quote;	 
				 }	 	
				 else
				 {
					 break;
				 }
		 }
		 return result;
  
		 
	}
}
 
