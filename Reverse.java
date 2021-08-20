package assignment;

import java.io.*;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of elements of a string:");
			int n=sc.nextInt();
			System.out.println("enter string elements:");
			for(int i=0;i<n;i++) 
			{
				list.add(sc.next());
			}
			System.out.println("Reverse Strings=");
			for(int i=list.size()-1;i>=0;i--)
			{
				System.out.println(list.get(i)+" ");
			}
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
			System.out.println("wrong input");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bounds");
		}

	}

}
