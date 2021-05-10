import java.util.*;
import java.io.*;

class Calculator{
    static double power1;
    static double power2;
    static double powerInt(int num1,int num2)
    {
        power1=Math.pow(num1,num2);
        return power1;
    }
   static double powerDouble(double num3,int num4)
    {
        power2=Math.pow(num3,num4);
        return power2;
    }
}

public class Calculators
{
  public static void main (String[] args)
 {
	  Scanner sc = new Scanner(System.in);
      System.out.print("For PowerInt :: ");
	  System.out.print("\nEnter a number : ");
      int a = sc.nextInt();
      System.out.print("Enter another number : ");
      int b = sc.nextInt();
	  double p1=Calculator.powerInt(a,b);
      System.out.print("For PowerDouble :: ");
	  System.out.print("\nEnter a number : ");
      double m = sc.nextDouble();
      System.out.print("Enter another number : ");
      int n = sc.nextInt();
	  double p2=Calculator.powerDouble(m,n);
	  System.out.println("The result of powerInt:"+p1);
	  System.out.println("The result of powerDouble:"+p2);
	  
 }
}