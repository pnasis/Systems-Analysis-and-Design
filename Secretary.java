public class Secretary extends User {
	
	private Application application = new Application();
	/**
	 * 
	 * @param status
	 */
	public void updateStatus(String status) {
		application.setStatus(status);
	}

}