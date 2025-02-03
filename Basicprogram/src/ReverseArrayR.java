import java.util.Scanner;

public class ReverseArrayR {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter array size");
		//int 
		int [] arr= new int[scanner.nextInt()];
		System.out.println("Original Array:");
		printArray(arr);
	    reverse(arr, 0, arr.length - 1);
	    System.out.println("Reversed Array:");
	    printArray(arr);
		
	}
	static void reverse(int arr[],int left,int right)
	{
		if(left>=right)
		{
			return;
		}
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		reverse(arr, left +1 , right-1);
	}

	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
}}
