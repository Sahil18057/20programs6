import java.util.Scanner;
class Ternary
{
	public static void main(String ars[])
	{
		int i, k;
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter value of i : ");
		i = scin.nextInt();
		k = i <0 ? -i : i;
		System.out.println("Absolue value of  ");
		System.out.println(i + " is " + k);


	}
}

/*

Enter value of i :
10
Absolue value of
10 is 10

*/