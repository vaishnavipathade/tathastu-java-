

/*  Write a Java program to calculate Permutation and Combination of 2 numbers */
import java.util.Scanner;
public class PermutationCombination {

	static int fact(int n)
	{
		if(n==1||n==0)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		System.out.println("Enter the value of r ");
		int r=sc.nextInt();
		int permutation=fact(n)/fact(n-r);
		int combination=fact(n)/(fact(r)*fact(n-r));
		System.out.println("The permutation is : "+permutation);
		System.out.println("The combination is : "+combination);
	}

}
