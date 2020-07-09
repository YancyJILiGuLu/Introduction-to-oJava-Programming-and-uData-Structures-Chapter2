
import java.util.Scanner;

public class Q2_5 {
	public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);	
	System.out.println("Enter the suntotal and gratuity rate");
		double subtotal = input.nextDouble();
		double gratuityRateEnter = input.nextDouble();
		double gratuityRate = gratuityRateEnter/10;
		double total =subtotal+gratuityRate;		
		System.out.println("The Gratuity is $"+gratuityRate +" and total is $"+total);
	}
}
