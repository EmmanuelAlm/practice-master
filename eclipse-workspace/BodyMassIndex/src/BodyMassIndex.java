import java.util.Scanner;
import java.lang.Math; 

public class BodyMassIndex {

	public static void main(String[] args) 
	{	
		System.out.println("ENTER YOUR HEIGHT IN INCHES AND WEIGHT IN POUNDS");
		BMI_Menu();
		
	}
	static void BMI_Menu() 
	{
		int pounds;
		int inches;
		double height;
		double weight;
		double BMI;
		boolean Gat = true;
		Scanner input = new Scanner(System.in);
		
		while(Gat)
		{
			
		System.out.println("Enter your Height: ");
		height = input.nextDouble();
		System.out.println("Enter your Weight: ");
		weight = input.nextDouble();
		height = Math.pow(height,2);
		BMI = weight * 703/height;
		System.out.println("Your Body Mass Index is: " + BMI);
		continue;
		}
	}

}
