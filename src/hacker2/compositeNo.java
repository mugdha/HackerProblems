import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class compositeNo {
public static void main(String1[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	if(T>=1 && T<=20)
	{
		ArrayList<Integer> primeNo = null;
		int upperBound = 0;
		for (int i = 0; i < T; i++) {
			 upperBound=sc.nextInt();
			primeNo=allPrimeNo(upperBound);
	
		  Set<Integer> h = new HashSet<Integer>();
		for (Iterator<Integer> iterator = primeNo.iterator(); iterator.hasNext();) {
			Integer i1 = (Integer) iterator.next();
			{
				for (Iterator<Integer> iterator2 = primeNo.iterator(); iterator2
						.hasNext();) {
					Integer i2 = (Integer) iterator2.next();
					if(i1*i2<=upperBound)
					{
						h.add(i1*i2);
					}
					
				}
			}
			
		}
		System.out.println(h.size());
		}
	}
}

private static ArrayList<Integer> allPrimeNo(int upperBound) {
	 
	ArrayList<Integer> prime=new ArrayList<>();
	int sqtt=(int) Math.sqrt(upperBound);
	boolean b[]=new boolean[upperBound+1];
	b[0]=false;
	b[1]=false;
	int a=2000000000;
	for (int i = 2; i < b.length; i++) {
		b[i]=true;
	}
	 for (int i = 2; i <= sqtt; i++) {
		  if(b[i])
		  {
			  for (int j = 2;;j++) {
				  if(i*j<=upperBound)
					  {b[j*i]=false;				
					  continue;}
				else
					break;
			}
		  }
	}
	 for (int i = 0; i < b.length; i++) {
		if(b[i])
			prime.add(i);
	}
	return prime;	
	
}
}
