import javax.swing.JOptionPane;

public class Example {
	public static void main(String[] args) {
		int testScore;
		String input;
		input = JOptionPane.showInputDialog("Enter your numeric " + 
							"test score and I will tell you the grade");
		testScore = Integer.parseInt(input);
		if (testScore < 60) {
			JOptionPane.showMessageDialog(null, "Your grade is an F");
		}
		else 
		{
			if (testScore <70)
			{
				JOptionPane.showMessageDialog(null, "Your grade is D.");
			}
			else 
			{
				if(testScore< 80)
				{
					JOptionPane.showMessageDialog(null, "Your grade is C");
				}
				else 
				{
					if(testScore< 90)
					{
						JOptionPane.showMessageDialog(null, "Your grade is B");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your grade is A");
					}
				
				}
			}
		}

		
	}
}





class ConditionalOperator
{
	public static void main(String[] args)
	{
		int x;
		int y;
		int z;
		int temp;
		int hours;
		int population;
		int base;
		int wages;
		int result;
		result = 0;
		wages = 15;
		hours = 40;
		base = 10;
		temp = 46;
		int unknown = 0;
		population = unknown;
		x = 5;
		y = 2;
		z = 0;
		
		System.out.println("The answer is " +  (x > y ? 1: 20));
		System.out.println("The population is " + (temp> 45 ? base*10: base*2));
		System.out.println("Did you get paid for ? " + (hours> 40 ? "Yes":"No"));
		System.out.println("What was the Result" + (result>= 0 ? "The result is positive": "The result is negative"));
		
		

	}
}


class ForLoop
{
	public static void main(String[] args)
	{
		int emma;
		
		for (emma = 0; emma <= 10; emma++)
		{
			System.out.print(emma );
		}
	}
}