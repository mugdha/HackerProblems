package hacker;

import java.util.Scanner;
import java.math.*;

public class encryption {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int len=s.length();
		
		double a=Math.sqrt(len);
		int column=(int) Math.ceil(a);
		int rows=(int) Math.floor(a);
		
		int mul=column*rows;
		if(mul<len)
		{
			rows=column;
		}
			
		
		int stringCounter=0;
		
		char grid[][]=new char[rows][column];
		for (int i = 0; i < rows;i++) {
			for (int j = 0; j < column;j++) {
				if(stringCounter<len){
				char temp=s.charAt(stringCounter);
				grid[i][j]=temp;
					stringCounter++;				
				
			}
			}			
		}
		 
		for (int i = 0; i < column;i++) {
			for (int j = 0; j < rows;j++) 				 
				{
				 if(grid[j][i]!=0)
					 System.out.print(grid[j][i]);	 				 
				
				}	
			System.out.print(" ");
		}
		
		
		
	}

}
