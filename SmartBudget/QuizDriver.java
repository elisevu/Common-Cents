import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class QuizDriver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int house, frequency, addPriorities;
		double spend;
		ArrayList link
		String street, city, state, primePri;
		System.out.println("Welcome to CommonCents!");
		/*System.out.println("Enter your house/apartment number: ");
		house = input.nextInt();
		System.out.println("Enter the name of your street: ");
		street = input.nextLine();
		input.nextLine();
		System.out.println("Enter the name of your city: ");
		city = input.nextLine();
		System.out.println("Enter the name of your state: ");
		state = input.nextLine();*/
		location = nui
        System.out.println("Enter your Username: ");
        name = input.nextLine();
        System.out.println("Enter your Password: ");
        pass = input.nextLine();
		System.out.println("Enter your current total balance: ");
		cur_balance = input.nextDouble();
		System.out.println("Give us a starting amount to work with: ");
		spend = input.nextDouble();
		input.nextLine();
		ShowMenu();
		System.out.println("You have now completed the new member questionaire! Your financial information and budget options are being computed.");
        new_User = new User(cur_balance, name, pass, "N/A");
        new_budget = new Budget();
        new_budget = setBudget(new_User, priorities)
	    link = [new_User, new_budget]
	}
		public static void ShowMenu() 
		{
			Scanner input = new Scanner(System.in);
			String p = "";
		List<String> priorities = new ArrayList<String>(10);
		System.out.println("Input your primary spending priority out of: Bills, Food, Necessities, Other");
		p+=input.nextLine();
		priorities.add(p);
		/*System.out.println("Do you have any additional priorities? Enter 1 for yes, enter anything else for no");
		int addPriorities = input.nextInt();
		while (addPriorities == 1)
		{
				System.out.println("Please name your priority of next importance: ");
				input.nextLine();
				p="";
				p+=input.nextLine();
				priorities.add(p);
				System.out.println("Would you like to add another priority? Enter 1 for yes, anything else for no");
		addPriorities = input.nextInt();*/
			}
		
		}
	}

