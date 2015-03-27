package hacker;

import java.util.Scanner;

public class maxXor {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		if(L>0 && L<=R)
			if(R>=L && R<=1000)
			{
				int maxXORVal=0;
				for(int i=L;i<R;i++)
				{
					for(int j=L;j<=R;j++)
					{
						int xor=i^j;			 
						if(xor>maxXORVal)
							maxXORVal=xor;
					}
				}
				System.out.println(maxXORVal);
			}
	}

}
