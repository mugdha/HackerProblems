package leetcode;

public class plusOne {
	public static void main(String[] args) {
		int a[]={9,9,9,9,9,9};
		int va[]=plusOne(a);
		for (int i = 0; i < va.length; i++) {
			System.out.print(va[i]+" ");
		}
	}
	 public static int[] plusOne(int[] digits) {
		
		 int carry=1;
		 for (int i = digits.length-1; i >=0; i--) {
			 int val=digits[i]+carry;
			 if(val==10)
			 {
				 digits[i]=0;
				 carry=1;
				 continue;
			 }
			 else
			 {
				 digits[i]=val;
				 carry=0;
				 break;
			 }
			
		}	
		 if(carry==1)
		 {
			 int newarray[]=new int[digits.length+1];
			 newarray[0]=1;
			 for (int i = 1; i < newarray.length; i++) {
				 newarray[i]=digits[i-1];
			}
			 return newarray;
		 }
		 return digits;
	        
	    }

}
