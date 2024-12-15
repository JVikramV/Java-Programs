import java.util.Scanner;
public class Student
{
	String USN;
	String Name;
	int Credits[];
	int Marks[];
	Student(int noofsubjects)
	{
		Credits=new int[noofsubjects];
		Marks=new int[noofsubjects];
	}
	public void AcceptDetails()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the USN=");
		USN=input.nextLine();
		System.out.print("\nENter the name=");
		Name=input.nextLine();
		for(int i=0;i<Credits.length;i++)
		{
			System.out.print("\nEnter the credits of Subject"+(i+1)+":");
			Credits[i]=input.nextInt();
			System.out.println("Enter the Marks of Subject"+(i+1)+":");
			Marks[i]=input.nextInt();
		}
	}
	public void DisplayDetails()
	{
		System.out.println("USN of Student="+USN);
		System.out.println("Name of Student="+Name);
		for(int i=0;i<Credits.length;i++)
		{
			System.out.println("Subject (i+1)  Credits:"+Credits[i]+"  Marks:"+Marks[i]);
		}
	}
	public void SGPA()
	{
		int Sum=0,total=0;
		for(int i=0;i<Credits.length;i++)
		{
			Sum+=(Marks[i]*Credits[i]);
			total+=Credits[i];
			
		}
		System.out.println("The SGPA of the student="+(Sum/total));
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the total number of Sybjects=");
		int num=input.nextInt();
		Student s1=new Student(num);
		s1.AcceptDetails();
		s1.DisplayDetails();
		s1.SGPA();
	}
}

		