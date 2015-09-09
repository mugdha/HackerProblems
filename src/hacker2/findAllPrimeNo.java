
public class findAllPrimeNo {
	
public static void main(String1[] args) {
	int a=100;
	int sqtt=(int) Math.sqrt(a);
	boolean b[]=new boolean[101];
	b[0]=false;
	b[1]=false;
	for (int i = 2; i < b.length; i++) {
		b[i]=true;
	}
	 for (int i = 2; i <= sqtt; i++) {
		  if(b[i])
		  {
			  for (int j = 2;;j++) {
				  if(i*j<101)
					  {b[j*i]=false;				
					  continue;}
				else
					break;
			}
		  }
	}
	 for (int i = 0; i < b.length; i++) {
		if(b[i])
			System.out.print(i+",");
	}
	
}
}
