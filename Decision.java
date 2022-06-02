public class Decision {

	private ArrayList<bool> vote;
	private ArrayList<String> comments;
	private string signature;
	private ArrayList<Members> members;
	private Member repporteur;

	/**
	 * 
	 * @param comment
	 */
	public void addComments(String comment) {
		// TODO - implement Decision.addComments
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vote
	 */
	public void addVote(bool vote) {
		// TODO - implement Decision.addVote
		throw new UnsupportedOperationException();
	}

	public ArrayList<bool> getVotes() {
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
	public void setSignature(string signature) {
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