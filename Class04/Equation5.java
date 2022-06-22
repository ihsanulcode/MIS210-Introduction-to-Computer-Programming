
public class Equation5 {

	public static void main(String[] args) {

		double degree = 45;
		double radians = Math.toRadians(degree);

		double answer = Math.pow(Math.sin(radians) + Math.cos(radians), 2);
		System.out.println("Answer: " + answer);

	}

}
