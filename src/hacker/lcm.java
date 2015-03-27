package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lengA=sc.nextInt();
		int lengB=sc.nextInt();
		sc.nextLine();
		int arrayA[]=new int[lengA];
		int arrayB[]=new int[lengB];
		
		String inputA=sc.nextLine();
		String inputPartA[]=inputA.split(" ");
		String inputB=sc.nextLine();
		String inputPartB[]=inputB.split(" ");
		if(inputPartA.length==lengA && inputPartB.length==lengB)
		{
			for (int i = 0; i < inputPartA.length; i++) {
				arrayA[i]=Integer.parseInt(inputPartA[i]);
			}
			for (int i = 0; i < inputPartB.length; i++) {
				arrayB[i]=Integer.parseInt(inputPartB[i]);
			}
			
			lcs(arrayA,arrayB);
			
		}
					
	}

	private static void lcs(int[] arrayA, int[] arrayB) {
		int[][] lengths = new int[arrayA.length+1][arrayB.length+1];
		
		ArrayList<Integer> result=new ArrayList<>();
		//row 0 and column 0 are initialized to 0 already
		
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if(arrayA[i]==arrayB[j])
					lengths[i+1][j+1]=lengths[i][j]+1;
				else
					lengths[i+1][j+1]=Math.max(lengths[i][j+1], lengths[i+1][j]);				
			}
			
		}
		for (int x=arrayA.length,y=arrayB.length;x!=0 && y!=0;) {
			if (lengths[x][y] == lengths[x-1][y])
	            x--;
	        else if (lengths[x][y] == lengths[x][y-1])
	            y--;
	        else
	        	if(arrayA[x-1]==arrayB[y-1])
	        	{
	        		result.add(arrayA[x-1]);
	        		x--;
	        		y--;
	        	}
			
		}
		 Collections.reverse(result);
		 for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
			
		}	
		 
	}

}
