import java.util.Scanner;

public class Member extends User {

	private String name;
	private String signature;
	private Application application;
	private Scanner keyboard = new Scanner(System.in);
	
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

	public void vote() {
		
		System.out.print("Vote for the application (true/false): ");
		String temp = keyboard.next();
		
		boolean vote;
		if(temp.equals("true"))
		{
			vote = true;
		}	
		else
		{
			vote = false;
		}	
		System.out.print("Write some comments about your vote: ");
		String comments = keyboard.next();
		
		application.getDecision().addVote(vote);
		application.getDecision().addComments(comments);
	}
	

}