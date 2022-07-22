import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter obtained marks: ");
		double marks = input.nextDouble();
		
		if(marks>=93)
			System.out.println("Grade A");
		else if(marks>=90)
			System.out.println("Grade A-");
		else if(marks>=87)
			System.out.println("Grade B+");
		else if(marks>=83)
			System.out.println("Grade B");
		else if(marks>=80)
			System.out.println("Grade B-");
		else if(marks>=77)
			System.out.println("Grade C+");
		else if(marks>=73)
			System.out.println("Grade C");
		else if(marks>=70)
			System.out.println("Grade C-");
		else if(marks>=66)
			System.out.println("Grade D+");
		else if(marks>=60)
			System.out.println("Grade D");
		else
			System.out.println("Grade F");
		
		
		

	}

}
