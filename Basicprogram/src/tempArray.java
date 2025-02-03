import java.util.Iterator;
import java.util.Scanner;import javax.print.DocFlavor.CHAR_ARRAY;

public class tempArray {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many days of the temperature");
		int n=scanner.nextInt();
		
		int arr[]=new int[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++) 
		{
			System.out.println("day "+(i+1) + "high temp");
			arr[i]=scanner.nextInt();
			sum=sum+arr[i];
		}
		double avg=(double)sum/n;
		System.out.println("average "+avg);
		
		int count=0;
		for(int temp:arr)
		{
			if(temp>avg)
			{
				count ++;
			}
		}
		System.out.println(count + " days above avaerage");
	}

}
