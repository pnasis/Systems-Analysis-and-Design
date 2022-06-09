import java.util.ArrayList;

public class Decision {

	/* Fields */
	private ArrayList<Boolean> vote = new ArrayList<>();
	private ArrayList<String> comments;
	private String signature;
	private ArrayList<Member> members;
	private Member rapporteur;

	/* Methods */
	
	// Constructor
	public Decision ()
	{
	
	}
	
	// Getters
	public ArrayList<Boolean> getVotes() {
		return this.vote;
	}
	public ArrayList<String> getComments() {
		return this.comments;
	}
	// Setters
	public void setRapporteur(Member rapporteur) {
		this.rapporteur = rapporteur;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	// Other Methods
	public void addMember(Member member) {
		members.add(member);
	}

	public void addComments(String comment) {
		comments.add(comment);
	}

	public void addVote(boolean vote) {
		this.vote.add(vote);
	}
	
}