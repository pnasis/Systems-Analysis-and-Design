import java.util.Scanner;

public class President extends User {

	private String name;
	private String signature;
	private Application application;
	private Scanner keyboard = new Scanner(System.in);
	
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
	
	public void sign() 
	{
		System.out.print("Please sign the application with ID " + application.getId() + ": ");
		String signature = keyboard.next();
		application.getDecision().setSignature(signature);
	}

	public void addRapporteur(Rapporteur rapporteur) 
	{
		application.getDecision().setRapporteur(rapporteur);
	}

	public void setMember(Member member) 
	{
		application.getDecision().addMember(member);
	}

}