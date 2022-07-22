import java.util.Scanner;

/*
 * 3.	Find out the result of y = ax +bx +c by using java program. Use any value for assign integer number.
 */
public class Qs3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Enter c: ");
		int c = input.nextInt();
		System.out.println("Enter x: ");
		int x = input.nextInt();

		double y = a * x + b * x + c;
		System.out.println("y = " + y);
	}

}
