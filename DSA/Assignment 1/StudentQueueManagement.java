import java.util.*;


public class StudentQueueManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> queue = new ArrayList<>();
		
		int choice;
		
		do {
			System.out.println("\n===== Student Queue Management =====");
			System.out.println("1. Add Student");
			System.out.println("2. Submit Assignment");
			System.out.println("3. Search Student");
			System.out.println("4. Display Queue");
			System.out.println("5. Count Students");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			   
			case 1:
				System.out.println("Enter Student ID: ");
				int studentId = sc.nextInt();
				
				queue.add(studentId);
				
				System.out.println("Student " + studentId + " added to the queue");
				break;
				
			case 2:
				if (queue.isEmpty()) {
					System.out.println("Queue is empty. No Student to process.");
				}
				else {
					int submittedAssignment = queue.remove(0);
					
					System.out.println("Student " + submittedAssignment + " submitted the assignment");
				}
				break;
				
			case 3:
				System.out.println("Enter Student ID to search: ");
				int searchId = sc.nextInt();
				
				if (queue.contains(searchId)) {
					System.out.println("Student " + searchId + " is waiting.");
				}
				else {
					System.out.println("Student " + searchId + " not waiting.");
				}
				break;
				
			case 4:
				if (queue.isEmpty()) {
					System.out.println("Queue is empty.");
				}
				else {
					System.out.println("Current Queue: " + queue);
				}
				break;
				
			case 5:
				System.out.println("Current number of Students: " + queue.size());
				break;
				
			case 6:
				System.out.println("Program ended");
				
			default:
				System.out.println("Invalid Choice. Please try again.");
			}
		}
		while (choice != 6);
			
		sc.close();
	}

}










