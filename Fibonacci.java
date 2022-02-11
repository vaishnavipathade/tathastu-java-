

/*  Write a Java program to calculate Fibonacci series upto n numbers*/
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n1=sc.nextInt();
		int a=0,b=1;
		for(int i=1;i<=n1;i++)
		{
			if(i==n1)
				System.out.print(a);
			else
				System.out.print(a+",");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
