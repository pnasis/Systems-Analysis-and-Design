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
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getTitle() {
		return title;
	}

	public String getDocs() {
		return docs;
	}

	public String getStatus() {
		return status;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getProposition() {
		return proposition;
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
	
	public void printData() {
		System.out.println("************************************");
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Department: " + getDepartment());
		System.out.println("Title: " + getTitle());
		System.out.println("Date: " + getDate());
		System.out.println("Docs: " + getDocs());
		System.out.println("Status: " + getStatus());
		System.out.println("************************************");
	}
}