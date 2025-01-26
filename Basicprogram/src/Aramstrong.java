import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the input ");
	int input=scanner.nextInt();
	aramstrongnum(input);
}

public static void aramstrongnum(int input)
{
	int copy=input;
	int result=0;
	while(input !=0)
	{
		int last=input%10;
		input=input/10;
		result=result+(last*last*last);
	}
	if(copy==result)
	{
		System.out.println(copy + " is AramStrong Number");
	}
	else {
		System.out.println(copy+ " is not a AramStrong Number");
	}

	}

}
