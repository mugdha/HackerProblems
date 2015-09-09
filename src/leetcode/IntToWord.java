package leetcode;

import java.util.Scanner;

public class IntToWord {
	private static String faceValue[]={"","one","two","three","four","five","six","seven","eight","nine" };
	private static String tens[]={"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String valueTY[]={"","ten", "twenty", "thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	 
public static void main(String[] args) {
	//for (int i = 1000; i < 1005; i++) {
		getWord(1292234);
	//}
	 
}
public static void getWord(int input)
{
	int tempCurrent;
	int tempPrev=0;;
	int pos=0;
	int original=input;
	String output="";
	String outputTillHundred="";
	String outputTillthousand="";
	while(input>0)
	{
		tempCurrent=input%10;
		input=input/10;		
		if(pos==0)
		{
			output+=faceValue[tempCurrent];
		}else if(pos==1)
		{
			if(tempCurrent==1)
			{
				output=tens[tempPrev];
			}
			else{
				if(tempPrev==0)
				{
					output=valueTY[tempCurrent];
				}
				else{
			        output=valueTY[tempCurrent]+" "+ output;
			        }
			}
		}
		else if(pos==2)
		{
			if(tempCurrent!=0)
			{
				output=faceValue[tempCurrent]+" hundred "+output;
				outputTillHundred=output;
			}
		}
		else if(pos==3)
		{
			if(tempCurrent!=0)
			{
				output=faceValue[tempCurrent]+" thousand "+output;
				outputTillthousand=output;
			}
		}
		else if(pos==4)
		{
			if(tempCurrent!=0)
			{
				if(tempCurrent==1)
				{
					output=tens[tempPrev]+" thousand "+ outputTillHundred;
					outputTillthousand=output;
				}
				else{
					if(tempPrev==0)
					{
						output=valueTY[tempCurrent]+" thousand "+outputTillHundred;
						outputTillthousand=output;
					}
					else{
				        output=valueTY[tempCurrent]+" "+ faceValue[tempPrev]+" thousand "+outputTillHundred;
				        outputTillthousand=output;
				        }
				}
			}
			
		}
		else if(pos==5)
		{
			if(tempCurrent!=0)
			{
				output=faceValue[tempCurrent]+" lakh "+outputTillthousand;
				//outputTillthousand=output;
			}
		}
		else if(pos==6)
		{
			if(tempCurrent!=0)
			{
				if(tempCurrent==1)
				{
					output=tens[tempPrev]+" lakh "+ outputTillthousand;
					//outputTillthousand=output;
				}
				else{
					if(tempPrev==0)
					{
						output=valueTY[tempCurrent]+" lakhs "+outputTillthousand;
						//outputTillthousand=output;
					}
					else{
				        output=valueTY[tempCurrent]+" "+ faceValue[tempPrev]+" lakhs "+outputTillthousand;
				        //outputTillthousand=output;
				        }
				}
			}
			
		}
		tempPrev=tempCurrent;
		pos++;
	}
	System.out.println(original+"::"+output);
}
}
