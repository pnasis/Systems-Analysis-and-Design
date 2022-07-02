import java.util.Scanner;

public class Professor extends User {
	
	/* Fields */
	private String name;
	private Application application;
	private Scanner keyboard = new Scanner(System.in);
	
	/* Methods */
	
	// Constructor
	public Professor(String email, String password, String name)
	{
		super(email,password);
		this.name=name;
	}
	
	// Application Creator
	public Application createApplication() 
	{
		// New Application
		System.out.print("Your name: ");
		String name = keyboard.next();
		System.out.print("Your department: ");
		String department = keyboard.next();
		System.out.print("Title: ");
		String title = keyboard.next();
		System.out.print("Date: ");
		String date = keyboard.next();
		System.out.print("Docs(yes/no): ");
		String docs = keyboard.next();
		
		if(docs.equals("no"))
		{
			System.out.println("\nYour application is incomplete!\n");
		}
		else {
		application = new Application(name, department, title, date, docs); 
		application.setStatus("Submited"); // Status is automatically set to Submitted when an Application is created
		}
		
		return application;
	}
} 