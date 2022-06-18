import java.util.ArrayList;

public class Member extends User {

	private String name;
	private String signature;
	private Application application;
	
	
	public Member(String email, String password, String name, String signature, Application application)
	{
		super(email, password);
		this.name = name;
		this.signature = signature;
		this.application = application;
	}
	
	public String getName() {
		return this.name;
	}

	public void vote(boolean vote, String comment) {
		application.getDecision().addVote(vote);
	}
	

}