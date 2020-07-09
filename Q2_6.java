import java.util.Scanner;

public class Q2_6 {
	public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);	
	System.out.println("Enter the number between 0-1000");
		int number = input.nextInt();
		int numberOfDigit = number%10;
		int number2 =number/10;
		int numberOfTens = number2%10;
		int number3=number2/10;	
		int sum =numberOfDigit+ numberOfTens+number3;	
		System.out.println("The sum of the digit is :"+sum);
	}
}
