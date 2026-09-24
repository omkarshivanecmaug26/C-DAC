import java.util.Scanner;

public class BillCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double amount = sc.nextDouble();
		double discount;
		
		if (amount >= 5000) {
			discount = amount * 0.20;
		} else if (amount >= 3000) {
			discount = amount * 0.15;
		} else if (amount >= 1000) {
			discount = amount * 0.10;
		} else {
			discount = 0;
		}
		
		double totalBill = amount - discount;
		
		System.out.println("Purchase Amount = " + amount);
		System.out.println("Discount = " + discount);
		System.out.println("Total Bill = " + totalBill);
		
	}

}









