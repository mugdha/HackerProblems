
public class reverserCString {
	
public static void main(String1[] args) {
	String1 a="mugdhakahkjkdjwidu ";
	char[] tochar=a.toCharArray();
	
	int p1=tochar.length-1;
	int p2=0;
	while(p2<p1)
	{
		char temp=tochar[p2];
		tochar[p2]=tochar[p1];
		tochar[p1]=temp;
		p2++;
		p1--;
	}
	System.out.println("Original:"+a);
	
	System.out.println("Reversed:"+a.copyValueOf(tochar));
	
}
}
