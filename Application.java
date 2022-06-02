public class Application {

	private string name;
	private string id;
	private string department;
	private string title;
	private string date;
	private string docs;
	private string proposition;
	private string status;

	public string getId() {
		return this.id;
	}

	public string getDate() {
		return this.date;
	}

	public string getProposition() {
		return this.proposition;
	}

	public string getCurrentStatus() {
		// TODO - implement Application.getCurrentStatus
		throw new UnsupportedOperationException();
	}

	public Decision getDecision() {
		// TODO - implement Application.getDecision
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(string id) {
		this.id = id;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(string department) {
		this.department = department;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(string title) {
		this.title = title;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(string date) {
		this.date = date;
	}

	/**
	 * 
	 * @param docs
	 */
	public void setDocs(string docs) {
		this.docs = docs;
	}

	/**
	 * 
	 * @param proposition
	 */
	public void setProposition(string proposition) {
		this.proposition = proposition;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(string status) {
		this.status = status;
	}

	/**
	 * 
	 * @param decision
	 */
	public void setDecision(Decision decision) {
		// TODO - implement Application.setDecision
		throw new UnsupportedOperationException();
	}

}