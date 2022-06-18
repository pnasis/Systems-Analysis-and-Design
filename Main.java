import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String again = "yes";
		//Creating an Application.
		while(again.equals("yes"))
		{
			Professor professor = new Professor("john.doe@uon.edu.gr","profes$oR","John");
			System.out.print("********ABOUT PROFESSOR********\n");
			System.out.print("Welcome " + professor.getEmail() +"! \n\nPlease fill out the form:\n");
			System.out.print("Your name: ");
			String name = keyboard.nextLine();
			System.out.print("Your department: ");
			String department = keyboard.nextLine();
			System.out.print("Title: ");
			String title = keyboard.nextLine();
			System.out.print("Date: ");
			String date = keyboard.nextLine();
			System.out.print("Docs(yes/no): ");
			String docs = keyboard.nextLine();
			
			if(docs.equals("no"))
				break;
			
			Application application = professor.createApplication(name, title, department, date, docs);
			System.out.println("\nYour Application has been created and submited successfully!\nYour application ID is: " + application.getId());
			
			//Creating the Secretary, President, Members & Rapporteur.
			Secretary secretary = new Secretary("secretary@uom.edu.gr", "seCretAry", application);
			President president = new President("manos@uom.edu.gr", "mAn0$u0M", "Ioannis", "Ioannis Manos", application);
			Member member1 = new Member("Member1", "member1", "Memeber 1" ,"Memeber 1", application);
			Member member2 = new Member("Member2", "member2", "Memeber 2" ,"Memeber 2", application);
			Member member3 = new Member("Member3", "member3", "Memeber 3" ,"Memeber 3", application);
			Member member4 = new Member("Member4", "member4", "Memeber 4" ,"Memeber 4", application);
			
			Member members[] = new Member[4];
			members[0]=member1;
			members[1]=member2;
			members[2]=member3;
			members[3]=member4;
			Rapporteur rapporteur = new Rapporteur("Rapporteur", "rapporteur", "Rapporteur", "Rapporteur", application);
			
			//President is signing the application and setting the members and the rapporteur.
			System.out.print("\n********ABOUT PRESIDENT********\n");
			System.out.print("Welcome " + president.getName() + "!\n");
			System.out.print("Please sign the application with ID " + application.getId() + ": ");
			String signature = keyboard.nextLine();
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
			String proposal = keyboard.nextLine();
			rapporteur.propose(proposal);
			System.out.print("Vote for the application (true/false): ");
			String temp = keyboard.nextLine();
			boolean vote;
			if(temp.equals("true"))
				vote = true;
			else
				vote = false;
			System.out.print("Write some comments about your vote: ");
			String comments = keyboard.nextLine();
			rapporteur.vote(vote, comments);
			
			//Members are voting.
			System.out.print("\n\n********ABOUT MEMBERS********\n");
			int possitive = 0;
			int negative = 0;
			for(int i=0; i<4; i++)
			{
				System.out.println("Member" + (i+1));
				System.out.println("--------");
				System.out.print("Vote for the application (true/false): ");
				boolean votem;
				String temp2 = keyboard.nextLine();
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
				String commentsm = keyboard.nextLine();
				members[i].vote(votem, commentsm);
				System.out.println();
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
	
			//Finish.
			System.out.println("You application has been "+ application.getCurrentStatus() +".\n");
			System.out.print("Do you wish to continue with a new application?(yes/no): ");
			again = keyboard.nextLine();
			System.out.println();
		}
	}
}
