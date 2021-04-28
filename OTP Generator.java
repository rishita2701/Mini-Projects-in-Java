//Developed By Rishita Mukherjee

// Java code to explain how to generate OTP


import java.util.*;

public class NewClass
{
	static char[] OTP(int len)
	{
		System.out.println("Generating OTP ..... ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++)
		{
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
	}
	public static void main(String[] args)
	{
		int length = 4;
    //you can use any length
		System.out.println(OTP(length));
	}
}
