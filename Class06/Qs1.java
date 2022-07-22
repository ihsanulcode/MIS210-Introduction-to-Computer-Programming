/*
 * 1.Jinan went to the grocery store for shopping. 
 * He had 2000 taka in his pocket. 
 * He bought dozen of eggs with the price of 50 taka, 
 * dozen of bananas with the price of 80 taka, 
 * meat with the price of 500 taka, apple with the price of 120 taka, 
 * potato with the price of 30 taka and fish with the price of 1200 taka. 
 * Please write a code to show, how much money did he spent all 
 * together and what was the remaining. Use java code to solve the problem and show the result.
 */

public class Qs1 {

	public static void main(String[] args) {

		double cash = 2000;
		double dozenEggs = 50;
		double dozenBanana = 80;
		double meat = 500;
		double apple = 120;
		double potato = 30;
		double fish = 1200;

		double spent = dozenEggs + dozenBanana + meat + apple + potato + fish;
		double remain = cash - spent;

		System.out.println("Spent all together: " + spent);
		System.out.println("Remaining balance: " + remain);

	}

}
