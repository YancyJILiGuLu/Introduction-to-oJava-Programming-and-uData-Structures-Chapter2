import java.text.DecimalFormat;
import java.util.Scanner;
public class Q2_11 {
private static DecimalFormat df = new DecimalFormat("00000000");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of years:");
		int years =input.nextInt();	
		double base=312032486;
		double totalMinutes=years*365*24*60*60;
		double newBorn=totalMinutes/7.0;
		double death=totalMinutes/13.0;
		double imigration=totalMinutes/45.0;
		double nYearsLater=base+newBorn-death+imigration;
		System.out.println("After five years later, the population of the US is :"+df.format(nYearsLater));
	}
}
