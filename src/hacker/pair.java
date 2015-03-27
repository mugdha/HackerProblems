package hacker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pair {
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();		
		int cell[][]=new int[row][column];
		boolean cellBool[][]=new boolean[row][column];
		int tempRow=row;
		if(row>0 && row<10)
		{ if(column>0 && column<10)
			{	 int rowCount=0;
				while(tempRow>=0)
				{
					 String[] ar=sc.nextLine().split(" ");						
					 if(ar.length==column){
						 for(int k=0;k<ar.length;k++)
						 {
							cell[rowCount][k]=Integer.parseInt(ar[k]);							 						 
						 }
						 rowCount++;
						
						 }
					 tempRow--;
				}
				//System.out.println(OutputVal);
			}
		}
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < column; j++) {
				cellBool[i][j]=false;
			}
		}
		int regionCount=0;	 
		// below is for inner loop
		for (int i = 1; i < row-1; i++) {			
			for (int j = 1; j < column-1; j++) {
				if(cell[i][j]==1)
				{
					if(cell[i-1][j]==1){
						cellBool[i-1][j]=true;
						cellBool[i][j]=true;}
						
					if(cell[i+1][j]==1)
						cellBool[i+1][j]=true;
					if(cell[i][j-1]==1)
						cellBool[i][j-1]=true;
					if(cell[i][j+1]==1)	
						cellBool[i][j+1]=true;
					
						if(cell[i-1][j-1]==1)	
							cellBool[i-1][j-1]=true;
						if(cell[i-1][j+1]==1)
							cellBool[i-1][j+1]=true;
						if(cell[i+1][j-1]==1)	
							cellBool[i+1][j-1]=true;
						if(cell[i+1][j+1]==1)	
							cellBool[i+1][j+1]=true;
				}		
			}
		}
		for (int i = 0; i < row-1; i++) {
			
			if(cell[i][0]==1)
			{
				if(cell[i+1][0]==1)
				cellBool[i+1][0]=true;
			}	
		}
			
		for (int i = 0; i < column-1; i++) {
					
					if(cell[0][i]==1)
					{
						if(cell[0][i+1]==1)
						cellBool[0][i+1]=true;
					}	
				} 
			for (int i = 0; i < row-1; i++) {
				
				if(cell[i][row-1]==1)
				{
					if(cell[i+1][row-1]==1){
					cellBool[i+1][row-1]=true;
					cellBool[i][row-1]=true;}
				}	
			}
				
			for (int i = 0; i < column-1; i++) {
						
						if(cell[column-1][i]==1)
						{
							if(cell[column-1][i+1]==1){
							cellBool[column-1][i+1]=true;
							cellBool[column-1][i]=true;}
						}	
					} 
		for (int i = 0; i < row; i++) {			
			for (int j = 0; j < column; j++) {	
				if(cellBool[i][j])
					regionCount++;
			}
		}
	 
		System.out.println(regionCount);
		
	}
}