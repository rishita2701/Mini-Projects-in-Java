import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of employee names you want to add:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter employee name: ");
			String m=sc.next();
			set.add(m);
		}
		System.out.println("\nThe employee names are : ");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		sc.close();
	}

}
