import java.text.DecimalFormat;
import java.util.Scanner;
public class Q2_14 {

		public static void main (String[] args) {
			DecimalFormat df = new DecimalFormat(".0000");//control output format
			Scanner input = new Scanner (System.in);
			System.out.println("Enter your weight in lb:");
			double weightInPounds = input.nextDouble();
			double	weightInKG=weightInPounds*0.45359237;
			System.out.println("Enter your height in inches:");
			double heightInInches = input.nextDouble();
			double heightInMeters=heightInInches*0.0254;
						
			double BMI = weightInKG/(Math.pow((heightInMeters), 2));
			System.out.println("Your BMI is:"+df.format(BMI));
		 }

}