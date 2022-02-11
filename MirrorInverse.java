

/*  Write a Java program to check whether the given array is mirror inverse or not  */

import java.util.*;
public class MirrorInverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		boolean f=true;
		for(int i=0;i<n;i++)
		{
			if(a[a[i]]!=i)
			{
				System.out.println("Not a mirror inverse");
				f=false;
				break;
			}
			
		}
		if(f)
			System.out.println("Yes , mirror inverse array");
		
	}

}
