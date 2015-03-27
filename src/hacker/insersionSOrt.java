package hacker;

import java.util.Scanner;

public class insersionSOrt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 	 
	long len=sc.nextLong();
	sc.nextLine();
	String sortedArra=sc.nextLine();		 
	String part[]=sortedArra.split(" ");
	long intArra[]=new long[(int) len];
	for (int i = 0; i < intArra.length; i++) {
		intArra[i]=Integer.parseInt(part[i]);
	}
	 Median(intArra);
}

private static void Median(long[] intArra) {
	// boolean swap=false;

	for (int i = 1; i < intArra.length; i++) {
		long val=intArra[i];
		int index=i;
	
		
		for (int j = i-1; j >=0; j--) {
			if(val<intArra[j])
			{	
				//swap=true;
				intArra[j+1]=intArra[j];
				index=j;			 
			 
			} 
		}
		intArra[index]=val;
		 	} 
  
long median=0;
if(intArra.length%2==0)   // even no
{
	median=(intArra[intArra.length/2]+intArra[intArra.length/2-1])/2;
}else
	
median=intArra[intArra.length/2];

System.out.println(intArra[(int) median]);

}
}
