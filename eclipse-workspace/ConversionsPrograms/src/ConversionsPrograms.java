import java.util.Scanner;


public class ConversionsPrograms
{
    public static void main(String[] args) 
    {
    	menu();
    }
    public static void menu()
    {
        
        boolean Prompt = true;
        
        while (Prompt)
        {    
            Scanner user_choice = new Scanner (System.in);
        	System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program\n");
            System.out.print("Please enter a distance in meters: ");
            double meters = user_choice.nextDouble();
            System.out.println("Enter your choice: ");
            int menu = user_choice.nextInt();
        	if(menu ==1) {
            	showKilometers(meters);
            }
            else if( menu == 2 )
            {
                showInches(meters);    
            }
            else if( menu == 3 )
            {
                showFeet(meters);      
            }
            else if( menu == 4 )
            {
                exitProgram();
            }
        }	
    }
    public static void showKilometers(double meters)
    {
        double kilometers;
        kilometers = meters * 0.001;
        System.out.println(+ meters + " meters is " + kilometers + " kilometers" );
    }
    public static void showInches(double meters)
    {
        double inches;
        inches = meters * 39.37;
        System.out.println(+ meters + " meters is " + inches + " inches" );
    }
    public static void showFeet(double meters)
    {
        double feet;
        feet = meters * 3.281;
        System.out.println(+ meters + " meters is " + feet + " feet" );
    }
    public static void exitProgram()
    {
    	System.out.println("You have Exited the program ");
        System.exit(0);
        
    }
}
