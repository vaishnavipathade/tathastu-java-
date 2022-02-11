
/* 
 	Write a Java program to perform basic Calculator opeartions
 */
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers ");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	boolean flag=true;
	while(flag)
	{
		System.out.println("************* Enter the operation ***************");
	char oper=sc.next().charAt(0);
	switch(oper)
	{
	case '+': System.out.println("The addition of "+n1+" and "+n2+" = "+(n1+n2));break;
	case '-': System.out.println("The subtraction of "+n1+" and "+n2+" = "+(n1-n2));break;
	case '*': System.out.println("The multiplication of "+n1+" and "+n2+" = "+(n1*n2));break;
	case '/': System.out.println("The division of "+n1+" and "+n2+" = "+(n1/n2));break;
	case '%': System.out.println("The modulus of "+n1+" and "+n2+" = "+(n1%n2));break;
	case 'E': System.out.println("Exit");flag=false;break;
	default:
		System.out.println("Invalid operation !!!");
		break;
	}
	}
	}

}
