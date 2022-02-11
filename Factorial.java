

/*  Write  a Java program to calculate a factorial of a number*/
import java.util.Scanner;
public class Factorial {

	static int fact(int n)
	{
		if(n==1||n==0)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n1=sc.nextInt();
		System.out.println("The factorial of "+n1+" is "+fact(n1));
	}

}
