package hacker;

import java.util.Scanner;

public class loney {
	static int lonelyinteger(int[] a) {
		  
		  boolean cellBool[]=new boolean[a.length];
		  for (int i = 0; i < cellBool.length; i++) {
			  cellBool[i]=false;
		}
		  
		  for (int i = 0; i < a.length-1; i++) {
			  for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					cellBool[i]=true;
					cellBool[j]=true;
				}
			}
			
		}
		  for (int i = 0; i < cellBool.length; i++) {
			if(!cellBool[i])
				return a[i];
		}
	      return 0;
	    }
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = lonelyinteger(_a);
	        System.out.println(res);
	        
	    }
}
