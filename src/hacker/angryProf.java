package hacker;

import java.util.Scanner;

public class angryProf {
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	// enter no of testcases
	int testcaseCount=sc.nextInt();
	String input1=sc.nextLine();
	if(testcaseCount>0 && testcaseCount<11)
	{
		for(int i=0;i<testcaseCount;i++)
		{
			String input=sc.nextLine();
			String inputarr[]=input.split(" ");
			//1st argument is number of students
			int noOfStud=Integer.parseInt(inputarr[0]);
			int studNeeded=Integer.parseInt(inputarr[1]);
			if(noOfStud>0 && noOfStud<=1000)
				if(studNeeded>0 && studNeeded<=noOfStud)
				{
					// enter each student with their in time. if its -ve then he enterd before the class
					String inputVal=sc.nextLine();
					String part[]=inputVal.split(" ");
					int counter=0;
					for(int j=0;j<part.length;j++)
					{
						
						if(part[j].length()==1 && part[j].contains("0"))
							counter++;
					  
						if(part[j].contains("-"))
							counter++;
					}
					if(counter>=studNeeded)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
				
			
		}
	}
	
}



}
