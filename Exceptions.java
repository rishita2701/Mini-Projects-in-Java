import java.util.Scanner;
public class Exceptions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        try
        {
        	int c = division(a, b);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
        sc.close();
    }
    public static int division(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
