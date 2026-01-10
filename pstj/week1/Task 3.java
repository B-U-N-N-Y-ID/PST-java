import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int arr[]={1,2,3,4,5,10,15,20,25,30,34,35,36,45};
		System.out.println("Enter the element");
		int a=in.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid;
		boolean found =false;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==a){
				System.out.println("element found at index"+mid);
				found=true;
				break;
			}else if(a<arr[mid]){

				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		if(!found){
			System.out.println("Element not found in array");
		}	

	}


}