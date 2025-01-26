import java.util.Scanner;

public class palindrome {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the input");
		int input=scanner.nextInt();
		palindromeres(input);
	}
	
	public static void palindromeres(int input)
	{
		int copy=input;
		int result=0;
		while(input !=0)
		{
			int last=input%10;
			input=input/10;
			result=result*10+last;
		}
		if(copy==result)
		{
			System.out.println(copy + " is palindrome");
		}
		else {
			System.out.println(copy + " is not a palindrome");
		}
		
	}
}
