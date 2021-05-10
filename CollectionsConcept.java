import java.util.*;

public class CollectionsConcept {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of string elements you want to add:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter string: ");
			String m=sc.next();
			set.add(m);
		}
		
		//Reverse the elements
		Iterator<String> it1 = set.descendingIterator();
		System.out.println("\nElements in Reverse Order:");
	     while (it1.hasNext()) {
	        System.out.println(it1.next());
	     }
		
	     //Iterate the elements
		Iterator<String> it2 = set.iterator();
		System.out.println("\nElements after iteration:");
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		//Check if a particular element exists or not
		Iterator<String> it = set.iterator();
		System.out.print("\nEnter string you want to check: ");
		String query=sc.next();
		boolean result=false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}		
		if (result) 
			System.out.println(query + " exists");
		else 
			System.out.println(query + " doesn't exist");
		
		sc.close();		
	}
}
