import java.util.Scanner;

public class CountNum {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the numbers");
		 int input=scanner.nextInt();
		 Count(input);
		
	}
	public static  void Count(int input)
	{
		int number=0;
		while(input !=0)
		{
			input=input/10;
			number++;
			
		}
		System.out.println(number);
	}

}
