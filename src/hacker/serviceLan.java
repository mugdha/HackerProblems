package hacker;

import java.util.Scanner;

public class serviceLan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String part[]=input.split(" ");
		
		int N=Integer.parseInt(part[0]); // no of service lane
		int T=Integer.parseInt(part[1]);// no of testcases to run
		int[] laneArray=new int[N];
		 	String lanWidth=sc.nextLine();
			String eachLan[]=lanWidth.split(" ");
			if(eachLan.length==N)
			{
				for (int j = 0; j < N; j++) 
					laneArray[j]=Integer.parseInt(eachLan[j]);					
			}
			for (int i = 0; i < T; i++) {	
				String entryExit=sc.nextLine();
				String[] ij=entryExit.split(" ");
				if(ij.length==2)
				{
					int entyPoint=Integer.parseInt(ij[0]);
					int exitPoint=Integer.parseInt(ij[1]);
					if(entyPoint<exitPoint)
					{
						int minOut=4;
						for (int k = entyPoint; k <=exitPoint; k++) {
							if(minOut>laneArray[k])
								minOut=laneArray[k];
						}
						System.out.println(minOut);
					}
				}
			 
			}
			
		}
		
	}
 
