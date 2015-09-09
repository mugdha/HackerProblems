import java.util.Scanner;


public class maxIndexproduct {
	public static void main(String1[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		if(T>=1 && T<=100000)
		{
			int a[]=new int[T];
			for (int i = 0; i < T; i++) {
				a[i]=sc.nextInt();
			}
			long max=0;
			int index1=0;
			int index2=0;
			for (int i = 0; i < T; i++) {
				
				for (int j = (i-1); j >= 0; j--) {
					if(a[j]>a[i])
						{
						index1=j+1;
						break;
						}
					index1=0;
				}
				for (int k = i+1; k < T; k++) {
					if(a[k]>a[i])
					{
						index2=k+1;
						break;
					}
					index2=0;
				}
				
			long indexPro=	index1*index2;
			if(indexPro>max)
				max=indexPro;
			}
			System.out.println(max);
		}
	}

}
