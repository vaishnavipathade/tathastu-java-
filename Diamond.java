
/* Write a program in Java to print Diamond pattern */


import java.util.*;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N ");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n1-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		for(int i=n1-1;i>=1;i--)
		{
			for(int j=1;j<=n1-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
	}

}
