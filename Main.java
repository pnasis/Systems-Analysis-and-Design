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
					+ "3)Exit\n"
					+ "Type 1, 2 or 3: ");
			int option = keyboard.nextInt();
			System.out.println();
			
			if(option==1)
			{
				//Creating an Application.
				System.out.println("********ABOUT PROFESSOR********");
				System.out.println("Welcome " + professor.getEmail() +"! \n\nPlease fill out the form:");
				System.out.print("Your name: ");
				String name = keyboard.next();
				System.out.print("Your department: ");
				String department = keyboard.next();
				System.out.print("Title: ");
				String title = keyboard.next();
				System.out.print("Date: ");
				String date = keyboard.next();
				System.out.print("Docs(yes/no): ");
				String docs = keyboard.next();
				
				if(docs.equals("no"))
				{
					System.out.println("\nYour application is incomplete!\n");
				}
				else {
					Application application = professor.createApplication(name, title, department, date, docs);
					System.out.println("\nYour Application has been created and submited successfully!\nYour application ID is: " + application.getId());
					listOfApplications.add(application);
					System.out.println("You application status is: "+ application.getCurrentStatus() +".\n");
				}
			}
			
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
				Rapporteur rapporteur = new Rapporteur("Rapporteur", "rapporteur", "Rapporteur", "Rapporteur", application);
				
				//President is signing the application and setting the members and the rapporteur.
				System.out.print("\n********ABOUT PRESIDENT********\n");
				System.out.print("Welcome " + president.getName() + "!\n");
				System.out.print("Please sign the application with ID " + application.getId() + ": ");
				String signature = keyboard.next();
				president.sign(signature);
				president.setMember(member1);
				president.setMember(member2);
				president.setMember(member3);
				president.setMember(member4);
				president.addRapporteur(rapporteur);
				
				//The secretary is updating the status to "Under Evaluation".
				System.out.println("\n********ABOUT SECRETARY********\nApplication status has been set to 'Under Evaluation'.\n");
				secretary.updateStatus("Under Evaluation");
				
				//The Rapporteur is proposing the application and voting.
				System.out.print("\n********ABOUT RAPPORTEUR********\n");
				System.out.print("Please propose the application with ID " + application.getId() + ": ");
				String proposal = keyboard.next();
				
				Rapporteur selectedRapporteur = (Rapporteur) application.getDecision().getRapporteur();
				selectedRapporteur.propose(proposal);
				
				System.out.print("Vote for the application (true/false): ");
				String temp = keyboard.next();
				boolean vote;
				int possitive = 0;
				int negative = 0;
				if(temp.equals("true"))
				{
					vote = true;
					possitive++;
				}	
				else
				{
					vote = false;
					negative++;
				}
					
				System.out.print("Write some comments about your vote: ");
				String comments = keyboard.next();
				rapporteur.vote(vote, comments);
				
				//Members are voting.
				System.out.print("\n\n********ABOUT MEMBERS********\n");
				
				ArrayList<Member> members = application.getDecision().getMembers();
				System.out.println();
				
				int i=1;
				for(Member member : members)
				{
					System.out.println("Member" + (i));
					System.out.println("--------");
					System.out.print("Vote for the application (true/false): ");
					boolean votem;
					String temp2 = keyboard.next();
					if(temp2.equals("true"))
					{
						votem = true;
						possitive++;
					}
					else
					{
						votem = false;
						negative++;
					}
					System.out.print("Write some comments about your vote: ");
					String commentsm = keyboard.next();
					member.vote(votem, commentsm);
					System.out.println();
					
					i++;
				}
				
				//The secretary is updating the status to "Under Evaluation".
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
			
			
			if(option==3)
			{
				System.out.println("The program has been terminated.\n");
				break;
			}
				
		}	
		
	}
}
