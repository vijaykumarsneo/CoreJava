package Convertion;

public class DecimalBinary 
{
	public static void main(String[] args) 
	{
		int num = 19;
		int binary = convertDecimalToBinary(num);
		System.out.println(num+" in binary = " +binary+ " in decimal");
	}

	public static int convertDecimalToBinary(int num) 
	{
		int remainder, i = 1;
		int binaryNumber = 0;
		while(num!=0)
		{
			remainder = num % 2;
			num = num/2;
			binaryNumber += remainder * i;
			i *=10;
		}
		return binaryNumber;
	}

}
