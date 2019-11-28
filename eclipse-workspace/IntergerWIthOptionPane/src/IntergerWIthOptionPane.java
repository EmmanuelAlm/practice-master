import javax.swing.JOptionPane;
public class IntergerWIthOptionPane {

	public static void main(String[] args) 
	{
		Menu();

	}
	static void Menu()
	{
		int age;
		
		String input;
		input = JOptionPane.showInputDialog("Enter your age");
		age = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, age);
		
		
	}

}
