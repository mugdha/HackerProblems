package hacker;

import java.util.Scanner;

public class kepler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lower=sc.nextInt();
		int upper=sc.nextInt();	
		StringBuffer outputlist=new StringBuffer();
		 
		for(int i=lower;i<=upper;i++)
		{
			long square;
			StringBuffer squarStringFrm=new StringBuffer();			 
			square=i*i;
			squarStringFrm=squarStringFrm.append(square);			 
			int len=squarStringFrm.length();
			for(int k=len-1;k>=0;k--)
			{
				
				String left=squarStringFrm.substring(k);
				String right=squarStringFrm.substring(0,k);
				int sum;
				if(left.equals("0")||left.equals("00")||left.equals("000")||left.equals("0000")||left.equals("00000"))
					continue;
				 if(right.equalsIgnoreCase(""))
				 {
					 sum=Integer.parseInt(left);
				 }
				 else
				 {
				
					 sum=Integer.parseInt(left)+Integer.parseInt(right);
					// System.out.println(sum);
				 }
				if(sum==i)
				{
					outputlist.append(i);
					outputlist.append(" ");	
					//1 System.out.println("OUTPIT"+i);
					break;
				}
							

			}	
			
		}
		if(outputlist.length()==0)
		{
			System.out.println("INVALID RANGE");
		}
		else
		{
		System.out.println(outputlist.toString());
		}
		
	}

}
