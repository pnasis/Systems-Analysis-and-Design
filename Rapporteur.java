import java.util.ArrayList;

public class Rapporteur extends Member {

	private String name;
	private String signature;
	private Application application;

	
	public Rapporteur(String email, String password, String name, String signature, Application application)
	{
		super(email,password, name, signature, application);
		this.application = application;
	}
	
	
	public void propose(String proposition) 
	{
		application.setProposition(proposition);
	}

}