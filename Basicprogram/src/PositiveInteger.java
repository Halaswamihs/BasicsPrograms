import java.util.Scanner;

public class PositiveInteger {
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=scanner.nextInt();
		System.out.println(positive(n));
	}
	
		public static int positive(int n)
		{
			
			if(n == 0 )
			{
				return 0;
			}
			return (n%10) + positive(n/10);
			
		}

}
