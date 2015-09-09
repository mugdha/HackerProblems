import java.math.BigInteger;
import java.util.HashMap;
java.math.BigDecimal;
 
import java.util.Scanner;

public class isFibo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int T = s.nextInt();
		if (T >= 1 && T <= 100000) {
			for (int i = 0; i < T; i++) {
				BigInteger bg=s.nextBigInteger(); 	
				BigInteger tp;
				BigInteger sp;
				
				
				 
						HashMap<BigInteger, BigInteger> fibo = new HashMap<BigInteger, BigInteger>();
						fibo.put(tp.valueOf(Integer.valueOf(0)),sp.valueOf(Integer.valueOf(1)));
						fibo.put(tp.valueOf(Integer.valueOf(1)),sp.valueOf(Integer.valueOf(1)));
						 
						
						if(input == 1) {
							System.out.println("IsFibo");
							break;
						}
						boolean f=false;
						for (int j = 2;; j++) {
							long temp=fibo.get((long)j-1)+fibo.get((long)j-2);
							if(temp==input)
							{
								System.out.println("IsFibo");
								f=true;
								break;
							}
							else if(temp>input)
							{
								break;
							}
							fibo.put((long) j, temp);
						}
						if(!f)
						System.out.println("IsNotFibo");

				}
			}
		}
	}

}
