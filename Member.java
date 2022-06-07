public class Member extends User {

	private String name;
	private String signature;
	private Application application;
	
	
	public Member(String email, String password, String name, String signature)
	{
		super();
		this.name = name;
		this.signature = signature;
	}
	
	public String getName() {
		return this.name;
	}

	public void vote(boolean vote, String comment) {
		
		throw new UnsupportedOperationException();
	}

}