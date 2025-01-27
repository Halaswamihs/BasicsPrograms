import java.util.Scanner;

public class lcm {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("GCD of numbers\nenter number1 " );
		int input1=scanner.nextInt();
		System.out.println("enter number2");
		int input2=scanner.nextInt();
		scanner.close();
		System.out.println("resulut \n" + result(input1,input2));
				
	}
	static int result(int input1,int input2)
	{ 
		int max = Math.max(input1, input2); // Start with the maximum of the two numbers
    
		while (true) 
		{
        if (max % input1 == 0 && max % input2 == 0) 
        {
            return max; // Return the LCM when the condition is met
        }
        max++; 
		}
    }
}
