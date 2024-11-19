import java.util.Scanner;
public class fact
{
        public int fact(int i)
	{
		if(i==1)
			return 1;
		return i*fact(i-1);
	}
    

	public static void main(String args[])
	{
		int i;
		System.out.print("enter the factorial");
		Scanner obj=new Scanner(System.in);
		i=obj.nextInt();
		int res=fact(i);
		if(i>0)
		{
		System.out.println("The factorial is:"+res);
		}
		else if(i<0)
		{
			System.out.println("factorial is not defined"):
		}
		else
		{
			System.out.println("Factorial of 0 is 1");
		}
	}
}



