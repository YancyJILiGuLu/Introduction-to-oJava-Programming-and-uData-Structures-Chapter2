
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2_9 {
private static DecimalFormat df = new DecimalFormat("00.00000");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter orinigal speed (in m/s),end speed (in m/s) and times (in s)");		
		double originalSpeed = input.nextDouble();	
		double finalSpeed=input.nextDouble();
		double time=input.nextDouble();	
		double accelaration=(finalSpeed-originalSpeed)/time;
		System.out.println("The average accelaration is :"+df.format(accelaration));
	}
}
