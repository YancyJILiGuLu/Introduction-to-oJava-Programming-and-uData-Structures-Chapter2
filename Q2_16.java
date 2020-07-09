
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q2_16 {
private static DecimalFormat df=new DecimalFormat("0.0000");//control output format
		public static void main (String[] args) {
			
			Scanner input = new Scanner (System.in);
			System.out.println("Enter the length of the side:");
			double length = input.nextDouble();
			
			double Area = ((3*Math.sqrt(3))/2)*Math.pow(length, 2);
			System.out.println("The area of the hexagon is:"+df.format(Area));
		 }

}

