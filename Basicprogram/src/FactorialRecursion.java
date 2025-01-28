import java.util.Scanner;


public class FactorialRecursion {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("recursion concept using ");
		System.out.println("enter the factorial of the number");
		int input=scanner.nextInt();
		System.out.println("Result");
		System.out.println(Factorial(input));
	}
	public static int Factorial(int input)
	{
		if(input<0)
		{
			return -1;
		}
		if(input == 0 || input == 1) {
			return 1;
		}
		return input * Factorial(input-1);
	}

}
