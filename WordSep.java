import java.util.Scanner;

public class WordSep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string : ");
	    String str1 = sc.next();
        System.out.print("Enter another string : ");
		String str2 = sc.next();
        System.out.print("Enter a separator : ");
		int separator=sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i < separator - 1; i++) 
			sb.append(str1).append(str2);
		sb.append(str1);
		
		System.out.println(sb);
	}

}

