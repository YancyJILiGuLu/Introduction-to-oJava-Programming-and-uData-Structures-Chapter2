
import java.text.DecimalFormat;
import java.util.Scanner;
public class  Q2_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat(".00000");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate:");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		double interest =balance * (interestRate/1200);
		System.out.println("Future value is :"+ df.format(interest) );



	}

}


