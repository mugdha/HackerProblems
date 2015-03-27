package hacker;

 
import java.util.PriorityQueue;
import java.util.Scanner;

public class cutTheStick {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		@SuppressWarnings("unchecked")
		
		PriorityQueue<Integer> stick=new PriorityQueue<>();
		PriorityQueue<Integer> temp=new PriorityQueue<>();
		sc.nextLine();		 
		String input=sc.nextLine();
		String part[]=input.split(" ");
		if(part.length==N)
		{
			
			for (int i = 0; i < N; i++) 
				stick.add(Integer.parseInt(part[i]));	
			while(!stick.isEmpty())
			{
			int minVal=stick.peek();
				int counter=0;
				while(!stick.isEmpty())
				{
					int a=stick.remove();
					int newVal=a-minVal;
					if(newVal>0)
					{ 
						temp.add(newVal);
					}						 
					counter++;
				}
				System.out.println(counter);
				stick.addAll(temp);
				temp.clear();
			 
		}  
	}
}
}

 
