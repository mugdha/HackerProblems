package hacker;

import java.util.Scanner;

public class pie {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalLine = sc.nextInt();
		int i = 0;
		String arrayInput[] = new String[totalLine+1];
		while (totalLine >=0) {
			arrayInput[i] = sc.nextLine();
			i++;
			totalLine--;
		}
		for (int j = 1; j < arrayInput.length; j++) {
			arrayInput[j] = arrayInput[j].replaceAll("\"", "");
			if (arrayInput[j].contains(",")) {
				arrayInput[j] = arrayInput[j].replace(",", " ");
			}
			if (arrayInput[j].contains("'")) {
				arrayInput[j] = arrayInput[j].replace("'", "");
			}

			String inputSplit[] = arrayInput[j].split(" ");
			StringBuffer numFormat = new StringBuffer();
			for (int k = 0; k < inputSplit.length; k++) {
				//System.out.println(inputSplit[k]);
				System.out.println(inputSplit[k].length());
				int eachWordLength = inputSplit[k].length();
				 numFormat.append(eachWordLength);
			}
			String outputtring=numFormat.toString();
			// System.out.println("in NUm formate"+numFormat);
			String pie = "31415926535897932384626433833";
			int lengthOFInput = outputtring.length();
			if (lengthOFInput < pie.length()) {
				pie = pie.substring(0, lengthOFInput);
			}
			if (pie.equalsIgnoreCase(outputtring)) {
				System.out.println("It's a pi song.");
			} else
				System.out.println("It's not a pi song.");

		}

	}

}
