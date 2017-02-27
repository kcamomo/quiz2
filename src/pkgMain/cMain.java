package pkgMain;

import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tuition;
		double percent;
		double sum = 0.0;
		
		System.out.print("Enter the tuition cost for each year (currently $12,342),"
				+ " no symbols: ");
		tuition = input.nextDouble();
		
		
		System.out.print("The percentage increase for each year is (between 3-5%, "
				+ "enter as a decimal):");
		percent = input.nextDouble();
		while( !(percent <=.05 && percent >= .03) )
		{
			System.out.println("The value must be in the range .03 to .05");
			
			System.out.print("The percentage increase for each year is (between 3-5%, "
					+ "enter as a decimal):");
			percent = input.nextDouble();
		}

		input.close();
		
		for (int year = 1; year <= 4; year++) {
			tuition += (tuition * percent);
			sum += tuition;
		}
		System.out.printf("The tuition for the four years is: $%.2f\n", sum);
	}
}
