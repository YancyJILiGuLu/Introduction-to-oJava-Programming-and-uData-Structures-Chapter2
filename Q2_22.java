import java.util.Scanner;
public class Q2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = input.nextInt();
		
		int numberOfDollors=amount/100;
		int remainingAmount = amount%100;
		
		int numberOfQuarters=remainingAmount/25;
		 remainingAmount = remainingAmount%25;
		 
		 int numberOfDimes=remainingAmount/10;
		remainingAmount = remainingAmount%10;
		 
		 int numberOfNickles=remainingAmount/5;
		remainingAmount = remainingAmount%5;
		
		 int numberOfPennies=remainingAmount;
		 
		 System.out.println("Your amount :"+ amount +" consists of ");
		 System.out.println("" +  numberOfDollors +" dollars");
		 System.out.println("" + numberOfQuarters +" quarters");
		 System.out.println("" + numberOfDimes+" dimes");
		 System.out.println("" + numberOfNickles+" nickles");
		 System.out.println("" + numberOfPennies+" pennies");
	}

}
