import java.util.ArrayList;

public class President extends User {

	private String name;
	private String signature;
	private Application application;
	
	public String getName() {
		return name;
	}

	public President(String email, String password, String name, String signature, Application application)
	{	
		super(email,password);
		this.name = name;
		this.signature = signature;	
		this.application = application;
	}
	
	public void sign(String signature) 
	{
		application.getDecision().setSignature(signature);
	}


	public void addRapporteur(Member rapporteur) 
	{
		application.getDecision().setRapporteur(rapporteur);
	}


	public void setMember(Member member) 
	{
		application.getDecision().addMember(member);
	}
	
	


}