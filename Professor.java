import java.io.File;
import java.util.ArrayList;

public class Professor extends User {
	
	/* Fields */
	private String name;
	private Application application;
	
	/* Methods */
	
	// Constructor
	public Professor(String email, String password, String name)
	{
		super(email,password);
		this.name=name;
	}
	
	// Application Creator
	public Application createApplication(String name, String title, String dep, String date, String docs) 
	{
		// New Application
		application = new Application(name, dep, title, date, docs); 
		application.setStatus("Submited"); // Status is automatically set to Submitted when an Application is created
		
		return application;
	}
} 