import java.util.Random;

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

	public Application(String name, String department, String title, String date, String docs)
	{
		Random rnd = new Random();
		this.name = name;
		this.id = "AM"+ rnd.nextInt(99999);
		this.department = department;
		this.title = title;
		this.date = date;
		this.docs = docs;
		decision = new Decision();
	}
	
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
		return decision;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	public void setProposition(String proposition) {
		this.proposition = proposition;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public void setDecision(Decision decision) {
		this.decision = decision;
	}

}