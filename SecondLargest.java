import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Second Largest number : "+ arr[n-2]);

	}

}
 