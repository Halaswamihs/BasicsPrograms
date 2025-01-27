import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int input=scanner.nextInt();
		fact(input);
	}
	static void fact(int input)
	{
		int result=1;
		for(int i=1;i<=input;i++)
		{
			result=result*i;
		}
		System.out.println(result);
	}

}
