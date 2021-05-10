import java.util.Scanner;

public class RemoveDuplicateElementFromArray{
	public static void main(String[] args){
		
		int[] arr_elements = new int[20];
		int initial_element,next_element;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int arr_size = sc.nextInt();
		
		System.out.println("Read Array Elements From User :");
		for(i=0;i<arr_size;++i)
		{
			arr_elements[i] = sc.nextInt();
		}

		System.out.println("Before removing duplicate element array are :");
		for(i=0;i<arr_size;++i)
		{
			System.out.print(arr_elements[i]+ "  ");
		}

		System.out.println("\nAfter removing duplicate element array are :");
		for(initial_element=0;initial_element<arr_size;++initial_element)
		{
			for(next_element=initial_element+1;next_element<arr_size;){
				if(arr_elements[initial_element] == arr_elements[next_element]){
					for(int temp = next_element; temp<arr_size; ++temp){
						arr_elements[temp] = arr_elements[temp+1];
					}
					arr_size = arr_size-1;		
				}		
				else
					next_element++;		
			}
		}
		
		for(i=0;i<arr_size;++i)
			System.out.print(arr_elements[i] + "  ");
	}
}
