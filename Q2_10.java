
import java.util.Scanner;
public class Q2_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cal = new Scanner(System.in);
		int C=4184;
		System.out.println("Enter the amount of water in kilograms:");
		double water = cal.nextDouble();

		System.out.println("Enter the initial temperature:");
		double initialTem = cal.nextDouble();
		System.out.println("Enter the final temperature:");
		double finalTem = cal.nextDouble();
		double energy =water * (finalTem-initialTem)*C;
		System.out.println("The cost os driving is $:"+energy);

	}

}
