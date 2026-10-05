import java.util.*;

public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int j = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		
		while (j<n) {
			arr[j] = 0;
			j++;
		}
		
		System.out.println("Array after moving zeros to the end: ");
		for (int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}
		

}
