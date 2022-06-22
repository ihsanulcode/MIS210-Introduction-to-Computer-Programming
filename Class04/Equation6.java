import java.util.Scanner;

public class Equation6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("x =  ");
		double x = input.nextDouble();
		
		double LHS = Math.pow(2, x+7);
		double RHS = Math.pow(4, x+2);
		
		System.out.println("LHS: "+LHS);
		System.out.println("RHS: "+RHS);
	}

}
