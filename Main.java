import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Creating the Professor.
		Professor professor = new Professor("john.doe@uon.edu.gr","profes$oR","John");
		System.out.println("Welcome " + professor.getEmail() +"! \nPlease fill out the form:\n");
		
		//Creating an Application.
		System.out.print("Your name: ");
		String name = keyboard.nextLine();
		System.out.print("Your department: ");
		String department = keyboard.nextLine();
		System.out.print("Title: ");
		String title = keyboard.nextLine();
		System.out.print("Date: ");
		String date = keyboard.nextLine();
		System.out.print("Docs: ");
		String docs = keyboard.nextLine();
		
		Application application = professor.createApplication(name, title, department, date, docs);
		
		//Creating the President, Members & Rapporteur.
		Secretary secretary = new Secretary("secretary@uom.edu.gr", "seCretAry", application);
		President president = new President("manos@uom.edu.gr", "mAn0$u0M", "Ioannis", "Ioannis Manos", application);
		Member member1 = new Member("Member1", "member1", "Memeber 1" ,"Memeber 1", application);
		Member member2 = new Member("Member2", "member2", "Memeber 2" ,"Memeber 2", application);
		Member member3 = new Member("Member3", "member3", "Memeber 3" ,"Memeber 3", application);
		Member member4 = new Member("Member4", "member4", "Memeber 4" ,"Memeber 4", application);
		Rapporteur rapporteur = new Rapporteur("Rapporteur", "rapporteur", "Rapporteur", "Rapporteur", application);
		
		president.sign("Ioannis Manos");
		president.setMember(member1);
		president.setMember(member2);
		president.setMember(member3);
		president.setMember(member4);
		president.addRapporteur(rapporteur);
		
		secretary.updateStatus("Under Evaluation");
		
		rapporteur.propose("Continue");
		rapporteur.vote(true, "Approved");
		member1.vote(true, "Approved");
		member2.vote(true, "Approved");
		member3.vote(true, "Approved");
		member4.vote(true, "Approved");
		
		secretary.updateStatus("\nApproved!");
		System.out.println(application.getCurrentStatus());
	}

}
