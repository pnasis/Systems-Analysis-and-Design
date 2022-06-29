import java.util.Scanner;

public class Rapporteur extends Member {

	private String name;
	private String signature;
	private Application application;
	private Scanner keyboard = new Scanner(System.in);
	
	public Rapporteur(String email, String password, String name, String signature, Application application)
	{
		super(email,password, name, signature, application);
		this.application = application;
	}
	
	
	public void propose() 
	{
		System.out.print("Please propose the application with ID " + application.getId() + ": ");
		String proposal = keyboard.next();
		application.setProposition(proposal);
	}

}