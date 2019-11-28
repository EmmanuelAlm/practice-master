import java.util.Scanner;
public class MagicDates {
	public static void main(String[] args)
	{
		menu();
	}
	static void menu() 
	{
		int day;
		int month;
		int year;
		int Magic;
		boolean Gat = true;
		Scanner input = new Scanner(System.in);
		while(Gat)
		{
			System.out.println("Enter a Date in this format 00/00/00");
			System.out.print("Enter a Day: ");
			day = input.nextInt();
			System.out.print("Enter a Month: ");
			month = input.nextInt();
			System.out.print("Enter a Year: ");
			year = input.nextInt();
			Magic = month * day;
			
			if(Magic == year)
			{
				System.out.println("The Date Is Magic!!!!!");
				continue;
			}
			else
			{
				System.out.println("The Date Is Not Magic");
				continue;
			}
		}
	}

}
