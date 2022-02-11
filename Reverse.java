

/*  Write a Java program to reverse the letters present in the given string  */
import java.util.Scanner;
public class Reverse {

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
		System.out.println(temp);
	}

}
