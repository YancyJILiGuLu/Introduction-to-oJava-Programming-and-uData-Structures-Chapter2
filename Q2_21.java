
import java.text.DecimalFormat;
import java.util.Scanner;
public class  Q2_21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double annualInterestRateInPercent=input.nextDouble();
		double annualInterestRate=annualInterestRateInPercent/100;
		double monthlyInterestInterestRate=annualInterestRate/12;
		System.out.println("Enter number of years:");
		int years=input.nextInt();

		double value = amount *(Math.pow((1+monthlyInterestInterestRate),years*12));

		System.out.println("Future value is :"+ df.format(value) );



	}

}


