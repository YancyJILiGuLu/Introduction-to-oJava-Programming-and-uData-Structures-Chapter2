


import java.text.DecimalFormat;
import java.util.Scanner;
public class  Q2_19 {

	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of three points separated by spaces:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1=Math.pow((Math.pow((y2-y1), 2)+Math.pow((x2-x1), 2)),0.5);
		double side2=Math.pow((Math.pow((y3-y2), 2)+Math.pow((x3-x2), 2)),0.5);
		double side3=Math.pow((Math.pow((y1-y3), 2)+Math.pow((x1-x3), 2)),0.5); 

		double s=(side1+side2+side3)/2;

		double a =Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);

		System.out.println("The area os this triangle is :"+ df.format(a) );



	}

}


