
import java.lang.Math;
import java.util.Scanner;

class SquareRoot
{
	public static void main(String args[])
	{
		double x;
		double y;
		Scanner scin=new Scanner(System.in);
		System.out.println("Enter the value : ");
		x=scin.nextDouble();
		y=Math.sqrt(x);
		System.out.println("Y = " +y);
	}
}

/*

Enter the value :
9
Y = 3.0

*/