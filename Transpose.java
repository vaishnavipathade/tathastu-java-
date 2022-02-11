
/*  Write a Java program to find the transpose of a given matrix */
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][] a=new int[r][c];
		System.out.println("Enter the values of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The given matrix is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 	System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The transpose of matrix is :");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
			 	System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
