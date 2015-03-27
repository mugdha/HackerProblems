package hacker;

import java.util.Scanner;

public class chocalateWrapper {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
         
    	// N is total money , C is cost of each chocalate and M is wrapper required
    	
    	long brough=N/C;
    	long totalChoco=brough;
    	if(brough<M)
    		return brough;
    	else
    	{
    		long wrappB=brough/M;
    		long rem=brough%M;
    		long total=wrappB+rem;
    		long additiona=0;
    		if(total>=M)
    			  additiona=total/M;
    		totalChoco=brough+wrappB+additiona;    		
    	}
    	
    	
    	return totalChoco;
    	
    }
    
}
