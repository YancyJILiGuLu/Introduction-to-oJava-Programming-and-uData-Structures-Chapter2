
import java.util.Scanner;

public class Q2_4 {
	public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);	
	System.out.println("Enter the a number in pounds");
		double pounds = input.nextDouble();	
		double Kilograms = pounds*0.454;		
		System.out.println(pounds +"pounds is "+Kilograms+" Kilograms");
	}
}
