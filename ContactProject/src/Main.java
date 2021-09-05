import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> phone_number = new ArrayList<String>();
		
		int quit = 0;
		int showInput = 0;
		
		Scanner scanner = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Welcome to your Contact List");			
		
		while(quit == 0) {			
			
			while(showInput == 0) {
				
				String name_intermediary = JOptionPane.showInputDialog("Enter the name");
				String email_intermediary = JOptionPane.showInputDialog("Enter the E-mail");
				String phone_intermediary = JOptionPane.showInputDialog("Enter the Phone Number");
				
				name.add(name_intermediary);
				email.add(email_intermediary);
				phone_number.add(phone_intermediary);
				
				showInput = JOptionPane.showConfirmDialog(null, "Do you want to add another contact?", "Choose",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
			}
			
			JOptionPane.showMessageDialog(null, "Thank you for using your Contact List, all the inserted names will be displayed on the console.");
			
			for(int i = 0; i < name.size(); i++) {
				
				System.out.println(name.get(i)+"\t|\t"+email.get(i)+"\t|\t"+phone_number.get(i)+"\n");
				
			}
			
			quit = 1;
			
		}
		
	}

}
