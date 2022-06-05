import java.util.ArrayList;

public class Decision {

	private ArrayList<Boolean> vote = new ArrayList<>();
	private ArrayList<String> comments;
	private String signature;
	private ArrayList<Member> members;
	private Member repporteur;

	/**
	 * 
	 * @param comment
	 */
	public void addComments(String comment) {
		// TODO - implement Decision.addComments
		comments.add(comment);
	}

	/**
	 * 
	 * @param vote
	 */
	public void addVote(boolean vote) {
		this.vote.add(vote);
	}

	public ArrayList<Boolean> getVotes() {
		// TODO - implement Decision.getVotes
		throw new UnsupportedOperationException();
	}

	public ArrayList<String> getComments() {
		return this.comments;
	}

	/**
	 * 
	 * @param signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * 
	 * @param member
	 */
	public void addMember(Member member) {
		// TODO - implement Decision.addMember
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rapporteur
	 */
	public void setRapporteur(Member rapporteur) {
		// TODO - implement Decision.setRapporteur
		throw new UnsupportedOperationException();
	}

}