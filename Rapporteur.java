import java.util.ArrayList;

public class Rapporteur extends Member {

	private ArrayList<Application> applications;
	private String name;
	private String signature;


	
	public Rapporteur(String email, String password, String name, String signature,
					  ArrayList<Application> list)
	{
		super(email,password, name, signature, list);
		this.applications = list;
	}
	
	
	public void propose(String proposition, Application app) 
	{
		for(Application a : applications)
			if(a.getId() == app.getId())
			{
				a.setProposition(proposition);
			}
	}

}