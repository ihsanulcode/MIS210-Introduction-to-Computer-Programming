import java.util.Scanner;

/*
 * 4. Please write a code where you can make a password for your personal fine and use it. 
 * For wrong entry it should show access deny, try it again. 
 * Please use java code to write the program.
 */
public class Qs4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String pass = "asif123";
		
		System.out.print("Enter your password: ");
		String passEntered = input.nextLine();
		
		if(pass.equals(passEntered)) {
			System.out.println("Password Correct");
		}else {
			System.out.println("Access denined!");
		}

	}

}
