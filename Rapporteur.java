import java.util.Scanner;

public class Rapporteur extends Member {

	private String name;
	private String signature;
	private Application application;
	private Scanner keyboard = new Scanner(System.in);
	private String proposition;
	
	public Rapporteur(String email, String password, String name, String signature, Application application)
	{
		super(email,password, name, signature, application);
		this.application = application;
	}
	
	
	public void propose() 
	{
		System.out.print("Please propose the application with ID " + application.getId() + ": ");
		proposition = keyboard.next();
		application.setProposition(proposition);
	}

}