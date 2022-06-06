public class Application {

	private String name;
	private String id;
	private String department;
	private String title;
	private String date;
	private String docs;
	private String proposition;
	private String status;
	private Decision decision;

	public String getId() {
		return this.id;
	}

	public String getDate() {
		return this.date;
	}

	public String getProposition() {
		return this.proposition;
	}

	public String getCurrentStatus() {
		return status;
	}

	public Decision getDecision() {
		// TODO - implement Application.getDecision
		return decision;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * 
	 * @param docs
	 */
	public void setDocs(String docs) {
		this.docs = docs;
	}

	/**
	 * 
	 * @param proposition
	 */
	public void setProposition(String proposition) {
		this.proposition = proposition;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
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