

/*  Write a Java program to find out whether the given string is palindrome or not */
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=sc.next();
		int i=s.length()-1;
		String temp="";
		while(i>=0)
		{
			temp+=s.charAt(i);
			i--;
		}
		if(s.equals(temp))
			System.out.println(s+" is a palindrome.");
		else
			System.out.println(s+" is not a palindrome.");

	}

}
