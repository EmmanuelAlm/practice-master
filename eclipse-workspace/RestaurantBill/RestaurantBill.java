import java.util.Scanner;


public class RestaurantBill {


	public static void main(String[] args) {
		
		double mealcost;
		double tax;
		double totalcost;
		double tip;
		double totalbill;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Please enter the cost of the meal: ");
		mealcost = scanner.nextDouble();	
		
		tax = mealcost * 0.0675;
		totalcost = mealcost + tax;
		tip = 0.2 * totalcost;
		totalbill = totalcost + tip;
		
		System.out.println("Your meal was: " + mealcost + ".");
		System.out.println("tax " + tax);
		System.out.println("Your tip amount is " + tip );
		System.out.println("Your total cost" + totalbill + ".");
	}

}
