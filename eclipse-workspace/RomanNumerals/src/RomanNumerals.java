import java.util.Scanner;

public class RomanNumerals
{
	public static void main(String[]args) 
	{
		Prompt();
	}		
	public static void Prompt() 
	{
		boolean menu= true;
		Scanner input = new Scanner(System.in);
		int user;
		String Rn1 = "I";
		String Rn2 = "II";
		String Rn3 = "III";
		String Rn4 = "IV";
		String Rn5 = "V";
		String Rn6 = "VI";
		String Rn7 = "VII";
		String Rn8 = "VIII";
		String Rn9 = "IX";
		String Rn10 = "X";
		
		
		while(menu) {
			System.out.print("Enter a Number to be Converted to Roman Numeral ");	
			user = input.nextInt();
			switch(user)
			{
			case 1:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is: " + Rn1);
				continue;
			case 2:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn2);
				continue;
			case 3:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn3);
				continue;
			case 4:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn4);
				continue;
			case 5:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn5);
				continue;
			case 6:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is: " + Rn6);
				continue;
			case 7:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn7);
				continue;
			case 8:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn8);
				continue;
			case 9:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn9);
				continue;
			case 10:
				System.out.println("The Number you chose " + user + " converted to a Roman Numeral is " + Rn10);
				continue;
			default:
				System.out.println("Error: The Number was not between 1 and 10!");
				continue;
			}
		}
	}
}
