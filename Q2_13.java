import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2_13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu	
		DecimalFormat df = new DecimalFormat(".0000");// control conput decimal format
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount:");
		double savingAmount = input.nextDouble();
		double rate =1+0.00417;
		double a=savingAmount*rate;
		double b=(savingAmount+a)*rate;
		double c=(savingAmount +b)*rate;
		double d=(savingAmount+c)*rate;
		double e=(savingAmount+d)*rate;
		double f=(savingAmount+e)*rate;

		System.out.print("After the sixth month,the account value is $"+df.format(f));

	}
}


