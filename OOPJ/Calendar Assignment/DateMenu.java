import java.time.LocalDate;
import java.util.Scanner;

public class DateMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate date = null;
		int choice;
		
		do {
			System.out.println("\n====Date Menu====");
			System.out.println("1. Set Date");
			System.out.println("2. Add days");
			System.out.println("3. Add Months");
			System.out.println("4. Add Years");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					System.out.println("Enter year : ");
					int year = sc.nextInt();
					
					System.out.println("Enter month : ");
					int month = sc.nextInt();
					
					System.out.println("Enter day : ");
					int day = sc.nextInt();
					
					date = LocalDate.of(year, month, day);
					System.out.println("Date set successfully");
					
					break;
					
				case 2:
					if (date == null) {
						System.out.println("Plese set the date first.");
					} else {
						System.out.print("Enter number of days to add: ");
						int days = sc.nextInt();
						
					  date = date.plusDays(days);
					  System.out.println("Days added successfully.");
					}
		             break;
		             
				case 3:
					if (date == null) {
						System.out.println("Please set the date first.");
					} else {
						System.out.println("Enter number of months to add:");
						int months = sc.nextInt();
						
					  date = date.plusMonths(months);
					  System.out.println("Months added successfully");
					}
				break;
				
				case 4:
					if (date == null ) {
						System.out.println("Please set the date first.");
					} else {
						System.out.println("Enter number of years to add:");
						int years = sc.nextInt();
						
					  date = date.plusYears(years);
					  System.out.println("Years added succeessfully");
					}
					break;
					
				case 5:
					if (date == null) {
						System.out.println("Date is not set.");
					} else {
						System.out.println("Current Date : " + date);
					}
				    break;
				    
				case 6:
					System.out.println("Program Exit");
					break;
				default:
					System.out.println("Invalid Choice!");
					
			}
		} while (choice != 6);
		 sc.close();

	}

}
