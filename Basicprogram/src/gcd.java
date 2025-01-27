import java.util.Scanner;

public class gcd {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("GCD of numbers\nenter number1 " );
		int input1=scanner.nextInt();
		System.out.println("enter number2");
		int input2=scanner.nextInt();
		System.out.println("resulut \n" + result(input1,input2));
				
	}
	static int result(int input1,int input2)
	{
		int min=0;
		if(input1<input2)
		{
			min=input1;
		}
		else
		{
			min=input2;
			
		}
		for(int i=min;i>=1;i--)
		{
			if(input1 %i == 0 && input2 % i ==0)
			{
				return i;
			}
		}
		return 1;
		
	}

}
