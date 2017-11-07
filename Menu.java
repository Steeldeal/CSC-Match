import java.util.Scanner;

public class Menu
{
	private static boolean start, saved, quit;
	static Scanner input;
	private static Membership mship;
	
	public Menu()
	{
		start = true;
		saved = true;
		quit = false;
	}
	
	public void displayMenu()
	{
		Scanner input = new Scanner(System.in);
		
		while (!quit)
		{
			if (start)
			{
				System.out.println("\nWhat would you like to do? (Enter number only)");
				System.out.println("1: Load membership");
				System.out.println("2: Start new membership");
				
				String response = input.next();
				
				switch (response)
				{
				    case "1": 
				    	loadMembership(input);
				    	break;
				    case "2": 
				    	newMembership();
				    	break;
				    default: 
				    	System.out.println("Your selection was invalid.");
				}
			}
			else
			{
				System.out.println("\nWhat would you like to do? (Enter number only)");
				System.out.println("1: Load membership");
				System.out.println("2: Save your membership");
				System.out.println("3: List current membership");
				System.out.println("4: Add a member");
				System.out.println("5: Remove a member");
				System.out.println("6: List a member");
				System.out.println("7: Add interest to a member");
				System.out.println("8: Quit");
				
				String response = input.next();
				
				switch (response)
				{
				    case "1": 
				    	loadMembership(input);
				    	break;
				    case "2": 
				    	saveMembership(input);
				    	break;
				    case "3": 
				    	listMembership(input);
				    	break;
				    case "4": 
				    	addMember(input);
				    	break;
				    case "5": 
				    	removeMember(input);
				    	break;
				    case "6": 
				    	listMember(input);
				    	break;
				    case "7": 
				    	addInterestToMember(input);
				    	break;
				    case "8": 
				    	quit(input);
				    	break;
				    default: 
				    	System.out.println("Your selection was invalid.");
				}
			}
		}
		
		System.out.println("Goodbye!");
	}
	
	public static void loadMembership(Scanner input)
	
	{
		System.out.println("Enter your filename: ");
		String filename = input.next();
		try
		{
			mship = Membership.load(filename);
			start = false;
			saved = true;
			System.out.println(filename + " has been loaded.");
		}
		catch (Exception e)
		{
			System.out.println("Bad file");
		}
	}
	
	public void newMembership()
	{
		mship = new Membership();
		System.out.println("A new membership has been created.");
		start = false;
	}
	
	public void saveMembership(Scanner input)
	{
		System.out.println("Save As: ");
		String filename = input.next();
		try
		{
			mship.save(filename);
			System.out.println(filename + " has been saved.");
			saved = true;
		}
		catch (Exception e)
		{
			System.out.println("Error saving file");
		}
	}
	
	public void listMembership(Scanner input)
	{
		mship.listSelf();
	}
	
	public void addMember(Scanner input)
	{
		System.out.println("Member: ");
		String member = input.next();
		int year = getInt("What year is " + member + "?", 1, 5, input);
		
		try
		{
			mship.addMember(member, year);
			saved = false;
		}
		catch (Exception e)
		{
			System.out.println("Error adding member.");
		}
	}
	
	public void removeMember(Scanner input)
	{
		System.out.println("Member: ");
		String member = input.next();
		mship.removeMember(member);
		saved = false;
	}
	
	public void listMember(Scanner input)
	{
		System.out.println("Member: ");
		String member = input.next();
		mship.listMember(member);
	}
	
	public void addInterestToMember(Scanner input)
	{
		System.out.println("Member: ");
		String member = input.next();
		System.out.println("Interest: ");
		String interest = input.next();
		System.out.println("Interest level: ");
		int level = getInt("How interested is " + member + " in " + interest + "?", 1, 10, input);
		mship.addInterestToMember(member, interest, level);
		saved = false;
	}
	
	public void quit(Scanner input)
	{
		if (!saved)
		{
			System.out.println("\nWould you like to save your work? Y/N");
			String response = input.next();
			
			switch (response.toLowerCase())
			{
			case "y":
				saveMembership(input);
				quit(input);
				break;
			case "n":
				break;
			default: 
		    	System.out.println("Your selection was invalid.");
		    	quit(input);
			}
		}
		quit = true;
	}
	
	private static int getInt(String prompt, int min, int max, Scanner input)
    {
    	int i;
    	
    	while (true)
    	{
    		System.out.println(prompt);
    		try
    		{
    			i = input.nextInt();
    			if(i < min || i > max)
		        {
		        	while(i < min || i > max)
		        	{
		        		System.out.println("Please enter an integer between " + min + " and " + max);
		        		i = input.nextInt();
		        	}
		        }
    		}
    		catch (Exception e)
    		{
    			System.out.println("Please enter an integer between " + min + " and " + max);
    			input.next();
    			continue;
    		}
    		if (i >= min && i <= max)
    			return i;
    	}
    }
}