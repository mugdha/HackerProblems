package hacker;

public class test {
	public static void main(String[] args) {
		String input=new String("mugdha,\",kjkiuiuiu'y kanni");
		 
		input=input.replaceAll("\"","");
		if(input.contains(","))
		{
			input=input.replace(",", " ");
		}
		if(input.contains("'"))
		{
			input=input.replace("'", "");
		}
		System.out.println(input.length());
	}

}
