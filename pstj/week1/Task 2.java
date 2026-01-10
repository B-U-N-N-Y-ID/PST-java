import java.util.*;
public class Array{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int arr[]={10,15,20,25,30,35,40,45};
		System.out.println("Enter the index");
		int index=in.nextInt();
		if(index>=0 &&index<arr.length){
			System.out.println("The Element at index"+index+"is"+arr[index]);
			
		}else{
			System.out.println("Enter the valid index");

		}


	}



}