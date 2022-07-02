import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Application> listOfApplications = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		Professor professor = new Professor("john.doe@uom.edu.gr","profes$oR","John");
		
		while(true)
		{
			//MENU
			System.out.print("----------------MENU----------------\n"
					+ "Choose an option:\n"
					+ "1)Submit an Application\n"
					+ "2)Find an application with id in order to review it\n"
					+ "3)Export Application (printData)\n"
					+ "4)Exit\n"
					+ "Type 1, 2, 3 or 4: ");
			int option = keyboard.nextInt();
			System.out.println();
			
			//The process of creating an application is staring.
			if(option==1)
			{
				//Creating an Application.
				System.out.println("********ABOUT PROFESSOR********");
				System.out.println("Welcome " + professor.getEmail() +"! \n\nPlease fill out the form:");
				Application application = professor.createApplication();
				if(application != null)
				{
					System.out.println("\nYour Application has been created and submited successfully!\nYour application ID is: " + application.getId());
					listOfApplications.add(application);
					System.out.println("You application status is: "+ application.getCurrentStatus() +".\n");
				}
			}
			
			//The process of review starts.
			if(option==2)
			{
				System.out.print("Enter the application id: ");
				String appId = keyboard.next();
				
				Application application = null;
				for(Application app : listOfApplications)
				{
					if(app.getId().equals(appId))
					{
						application = app;
						break;
					}
				}
				
				//Creating the Secretary, President, Members & Rapporteur.
				Secretary secretary = new Secretary("secretary@uom.edu.gr", "seCretAry", application);
				President president = new President("manos@uom.edu.gr", "mAn0$u0M", "Ioannis", "Ioannis Manos", application);
				Member member1 = new Member("Member1", "member1", "Member 1" ,"Member 1", application);
				Member member2 = new Member("Member2", "member2", "Member 2" ,"Member 2", application);
				Member member3 = new Member("Member3", "member3", "Member 3" ,"Member 3", application);
				Member member4 = new Member("Member4", "member4", "Member 4" ,"Member 4", application);
				Rapporteur member5 = new Rapporteur("Rapporteur", "rapporteur", "Rapporteur", "Rapporteur", application);
				//We consider there is a rapporteur created by default.
				
				
				//President is signing the application and setting the members and the rapporteur.
				System.out.print("\n********ABOUT PRESIDENT********\n");
				System.out.print("Welcome " + president.getName() + "!\n");
				
				president.sign();
				president.setMember(member1);
				president.setMember(member2);
				president.setMember(member3);
				president.setMember(member4);
				president.addRapporteur(member5);
				
				
				//The secretary is updating the status to "Under Evaluation".
				System.out.println("\n********ABOUT SECRETARY********\nApplication status has been set to 'Under Evaluation'.");
				secretary.updateStatus("Under Evaluation");
								
				//The Rapporteur is proposing the application and voting.
				System.out.print("\n********ABOUT RAPPORTEUR********\n");
				Rapporteur selectedRapporteur = application.getDecision().getRapporteur();
				selectedRapporteur.propose();				
				selectedRapporteur.vote();
				
				//Members are voting.
				System.out.print("\n********ABOUT MEMBERS********\n");
				ArrayList<Member> members = application.getDecision().getMembers();
				System.out.println();
				
				int i=1;
				for(Member member : members)
				{
					System.out.println("Member" + (i));
					System.out.println("--------");
					member.vote();
					System.out.println();
					
					i++;
				}
				
				int possitive = 0;
				int negative = 0;
				for(boolean vote : application.getDecision().getVotes())
				{
					if(vote)
						possitive++;
					else
						negative++;
				}
				
				//The secretary is updating the status to "Approved" or "Disapproved" based on the votes.
				if(possitive > negative)
				{
					secretary.updateStatus("Approved");
					System.out.println("\n********ABOUT SECRETARY********\nApplication status has been set to 'Approved'.\n");
				}
				else
				{
					secretary.updateStatus("Disapproved");
					System.out.println("\n********ABOUT SECRETARY********\nApplication status has been set to 'Disapproved'.\n");
				}
			}
			
			//"Exporting" the application.
			if(option==3)
			{
				for(Application app : listOfApplications)
				{
					app.printData();
					System.out.println();
				}
			}
			
			//The program terminates.
			if(option==4)
			{
				System.out.println("The program has been terminated.\n");
				break;

			}
				
		}	
	}
}
