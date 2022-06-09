import java.io.File;
import java.util.ArrayList;

public class Professor extends User {
	
	/* Fields */
	
	private String name;
	private ArrayList<Application> appList = new ArrayList<Application>();
	
	/* Methods */
	
	// Constructor
	public Professor(String email, String password, String name)
	{
		super(email,password);
		this.name=name;
	}
	
	// Application Creator
	public void createApplication(String title, String dep, String date,
								  File doc) 
	{
		// New Application
		Application app = new Application(); 
		Decision dec = new Decision();
		
		app.setName(this.name);
		app.setTitle(title);
		app.setDepartment(dep);
		app.setDate(date);
		app.setDocs(doc);
		app.setStatus("Submitted"); // Status is automatically set to Submitted when an Application is created
		app.setDecision(dec);
		
		// Add new Application to ArrayList
		appList.add(app);		
	}
} 