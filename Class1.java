import java.util.Scanner;
public class Class1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a=");
		int a=input.nextInt();
		System.out.println("Ente rthe value of b=");
		int b=input.nextInt();
		System.out.println("Enter the value of c=");
		int c=input.nextInt();
		double d=(b*b)-(4*a*c);
		if(d<0)
		{
			System.out.println("No real roots exist!");
		}
		else if(d==0)
		{
			double root=-b/(2*a);
			System.out.println("The Roots are real and equal.");
			System.out.println("Root1="+root+"  Root2="+root);
		}
		else
		{
			double root1=(-b+Math.sqrt(d))/(2*a);
			double root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The roots are real and different\nRoot1="+root1+"  Root2="+root2);
		}
	}
}
