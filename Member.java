public class Member extends User {

	private String name;
	private String signature;
	private Application application;
	
	
	public Member(String email, String password)
	{
		super();
	}
	
	public String getName() {
		return this.name;
	}

	public void vote(boolean vote, String comment) {
		
		throw new UnsupportedOperationException();
	}

}