import java.util.Scanner;
public class Q2
{
	public static void main(String args[])
	{
		System.out.print("Enter your Salary: ");
		Scanner inp = new Scanner(System.in);
		double sal = inp.nextDouble();
		if(sal<100000)
		{
			sal	= (sal*12*0.15)+(sal*12);
			System.out.println("Incremented Salary is: " +sal);
		}
		else if(100000<=sal & sal<200000)
		{
			sal = (sal*12*0.10)+(sal*12);
			System.out.println("Incremented Salary is: " +sal);
		}
		else if(sal>=200000)
		{
			sal = (sal*12*0.05)+(sal*12);
			System.out.println("Incremented Salary is: " +sal);
		}
	}	
}