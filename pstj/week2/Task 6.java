import java.util.*;

public class PrintPairs {
    	public static void main(String[] args) {

        	Scanner in = new Scanner(System.in);

        	System.out.print("Enter number of elements: ");
        	int n = in.nextInt();

        	int[] arr = new int[n];

        	System.out.println("Enter " + n + " elements:");
        	for (int i = 0; i < n; i++) {
           		arr[i] = in.nextInt();
       		 }

        	System.out.println("All possible pairs are:");

        	for (int i = 0; i < n; i++) {
            		for (int j = i + 1; j < n; j++) {
                		System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            		}
       		 }

        
    }
}