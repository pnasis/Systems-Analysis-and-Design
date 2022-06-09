public class Member extends User {

	private String name;
	private String signature;
	private ArrayList<Application> applications;
	
	
	public Member(String email, String password, String name, String signature, 
		      ArrayList<Application> list)
	{
		
		super(email,password);// To eixa super(email,signature) kai moy ebgaze error
		this.name = name;
		this.signature = signature;
		this.applications = list;
	}
	
	public String getName() {
		return this.name;
	}

	public void vote(boolean vote, String comment, Application app) {
		Decision aDecision;
		
		for(Application a : application) {
			if(a.getId() == app.getId()) {
				aDecision = a.getDecision();
				aDecision.addVote(vote);
				aDecision.addComments(comment);
				a.setDecision(aDecision); 
			}
		}
	}
	

}
