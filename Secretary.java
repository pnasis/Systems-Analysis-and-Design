public class Secretary extends User {
	
	private Application application = new Application();
	
	public Secretary(String email, String password)
	{
		super();
	}
	public void updateStatus(String status) {
		application.setStatus(status);
	}

}