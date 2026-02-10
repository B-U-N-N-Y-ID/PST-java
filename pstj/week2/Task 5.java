import java.util.*;


public class KthSmallestElement {
   	 public static void main(String[] args) {

        	Scanner in = new Scanner(System.in);

        	System.out.print("Enter number of elements: ");
        	int n = in.nextInt();

        	int[] arr = new int[n];

       		System.out.println("Enter " + n + " elements:");
        	for (int i = 0; i < n; i++) {
            		arr[i] = in.nextInt();
        	}

        	System.out.print("Enter value of K: ");
        	int k = in.nextInt();

        	if (k <= 0 || k > n) {
            		System.out.println("Invalid value of K");
       		 } else {
           		 Arrays.sort(arr);
            		System.out.println("Kth smallest element is: " + arr[k - 1]);
       		 }

        
    }
}