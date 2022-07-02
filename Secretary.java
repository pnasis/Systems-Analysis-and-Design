public class Secretary extends User {
	
	Application application;
	
	public Secretary(String email, String password, Application application)
	{
		super(email,password);
		this.application = application;
	}
	
	public void updateStatus(String status)
	{
		application.setStatus(status);
	}

}
