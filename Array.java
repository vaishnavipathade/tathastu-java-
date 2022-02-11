/* Write a Java program to remove elements from an ArrayList  */

import java.util.*;
public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(18);
		a.add(27);
		System.out.println("The elements in the array before removing");
		
		System.out.println(a);
		
		System.out.println("The elements in the array after removing "+ a.remove(2));
		
		System.out.println(a);	
	}

}
