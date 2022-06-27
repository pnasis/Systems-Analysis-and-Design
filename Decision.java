import java.util.ArrayList;

public class Decision {

	/* Fields */
	private ArrayList<Boolean> vote;
	private ArrayList<String> comments;
	private String signature;
	private ArrayList<Member> members;
	private Member rapporteur;

	/* Methods */
	
	// Constructor
	public Decision ()
	{
		vote = new ArrayList<>();
		comments = new ArrayList<>();
		members = new ArrayList<>();
	}
	
	// Getters
	public ArrayList<Boolean> getVotes() {
		return this.vote;
	}
	
	public ArrayList<String> getComments() {
		return this.comments;
	}
	
	
	public ArrayList<Member> getMembers() {
		return members;
	}

	
	public Member getRapporteur() {
		return rapporteur;
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