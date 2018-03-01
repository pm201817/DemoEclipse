package DemoTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number as A");
		a= sc.nextInt();
		System.out.println("Enter 2nd number as B");
		b= sc.nextInt();
		
				//Compare 2 numbers entered and display largest of these 2 numbers.
		
		if (a>b)
		{
			System.out.println("Largest number amongst both numbers is A " +a);
		}
		else 
		{
			System.out.println("Largest number amongst both numbers is B " +b);
		}
		
		sc.close();

	}

}
