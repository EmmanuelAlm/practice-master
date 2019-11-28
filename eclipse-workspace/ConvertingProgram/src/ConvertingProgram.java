import java.util.Scanner;

public class ConvertingProgram {
	public static void main(String[] args) {
	    }
	    public static void menu()
	    {
	    	
	        Scanner keyboard = new Scanner (System.in);
	        System.out.print("Please enter a distance in meters: ");
	        double meters = keyboard.nextDouble();
	        System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program ");
	        System.out.print("\nEnter your choice: ");
	        int menu = keyboard.nextInt();
	    }
	        public static void showKilometers(double meters)
	        {
		        double kilometers;
		        kilometers = meters * 0.001;
		        System.out.print(+ meters + " meters is " + kilometers + " kilometers" );
		    }
		    public static void showInches(double meters)
		    {
		        double inches;	         
		        inches = meters * 39.37;
		        System.out.print(+ meters + " meters is " + inches + " inches" );
		    }
		    public static void showFeet(double meters)
		    {
		        double feet;        
		        feet = meters * 3.281;
		        System.out.print(+ meters + " meters is " + feet + " feet" );
	        int menu;
			while( menu != 4)
	        {
	            if( menu == 1 )
	            {
	                showKilometers();
	            }
	            else if( menu == 2 )
	            {
	                showInches(feet);   
	            }
	            else if( menu == 3 )
	            {
	                showFeet();     
	            }
	            else if( menu == 4 )
	            {
	                exitProgram();
	            }
	           }
			public static void exitProgram();
	    
		    }
}

