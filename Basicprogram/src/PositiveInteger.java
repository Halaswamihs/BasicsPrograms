import java.util.Scanner;

//How to find the sum of digits of a positive integer number using recursion ?
public class PositiveInteger {
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scanner.nextInt();
		if(n<0)
		{
			System.out.println("enter only positive number ");
		}
		else {
			System.out.println(positive(n));
		}
	}
	
		public static int positive(int n)
		{
			
			
			return (n%10) + positive(n/10);
			
		}

}
