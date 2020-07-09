
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q2_23 {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cal = new Scanner(System.in);

		System.out.println("Enter the driving distance:");
		double distance = cal.nextDouble();

		System.out.println("Enter miles per gallon:");
		double MPG = cal.nextDouble();
		System.out.println("Enter price per gallon:");
		double PPG = cal.nextDouble();
		double cost =(distance/MPG)*PPG;
		System.out.println("The cost os driving is $:"+df.format(cost));




	}

}
