public class Secretary extends User {
	
	private ArrayList<Application> applications;
	
	public Secretary(String email, String password, ArrayList <Application> list)
	{
		super(email,password);
		this.applications == list;
	}
	public void updateStatus(String status) {
		for (Application a : applications)
		{
			if (a.getId() == app.getId())
			{
				a.setStatus(status);
			}
		}
		application.setStatus(status);
	}

}
