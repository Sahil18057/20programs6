import java.util.Scanner;

class Scope
{
	public static void main(String args[])
	{
		int x;
		// x=10;
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		x=scin.nextInt();
		if(x==x)
		{
			int y; // y=20
			System.out.println("Enter the value of y : ");
			y=scin.nextInt();
			System.out.println("x and y " +x+ " " +y);
			x=y*2;
		}
		System.out.println("x is "+x);
	}
}



/*

E:\JDK\javaprograms>java Scope
Enter the value of x :
10
Enter the value of y :
20
x and y 10 20
x is 40

*/