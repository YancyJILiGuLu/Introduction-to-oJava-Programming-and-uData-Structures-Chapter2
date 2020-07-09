import java.util.Scanner;
import java.text.DecimalFormat;
public class Q2_12 {
		private static DecimalFormat df = new DecimalFormat("0.0000");// control output decimal format
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter speed and acceleration:");
		double speed = input.nextDouble();
		double acceleration= input.nextDouble();
		double lengthOfRunning = (Math.pow(speed,2))/(2*acceleration);		
		System.out.println("the minimum runway for this airplane is:"+df.format(lengthOfRunning));
	}

}
