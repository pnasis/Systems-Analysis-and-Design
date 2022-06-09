import java.util.ArrayList;

public class President extends User {

	private String name;
	private String signature;
	private ArrayList<Application> applications;
	
	
	public President(String email, String password, String name, String signature,
					 ArrayList<Application> list)
	{	
		super(email,password);
		this.name = name;
		this.signature = signature;	
		this.applications = list;
	}
	
	public void sign(String signature, Application app) 
	{
		Decision aDecision;
		
		for(Application a : applications)
		{
			if(a.getId() == app.getId())
			{
				aDecision = a.getDecision();
				aDecision.setSignature(signature);
				a.setDecision(aDecision);
			}
		}
	}


	public void addRapporteur(Member rapporteur, Application app) 
	{
		Decision aDecision;
		for(Application a : applications)
		{
			if(a.getId() == app.getId())
			{
				aDecision = a.getDecision();
				aDecision.setRapporteur(rapporteur);
				a.setDecision(aDecision);
			}
		}
	}


	public void setMember(Member member, Application app) 
	{
		Decision aDecision;
		for(Application a : applications)
		{
			if(a.getId() == app.getId())
			{
				aDecision = a.getDecision();
				aDecision.addMember(member);
				a.setDecision(aDecision);
			}
		}	
	}
	
	


}