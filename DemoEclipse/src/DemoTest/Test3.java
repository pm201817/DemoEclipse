package DemoTest;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		String a[] = new String[5];		
		Scanner sc=new Scanner(System.in);
				
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Enter names of students ");
						a[i]= sc.next();
		}
		
		System.out.println("\nList of Arrary entered by User is ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\n");
		}
		sc.close();

	}

}