
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q2_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number of minutes");
	Scanner	input = new Scanner(System.in);
		long minutes = input.nextInt();	//use long instant of int bc 1000000000 is a large number , int is not suitable
		long years=minutes/(365*24*60);

		long minutesLeft=minutes%(365*24*60);
		
		long days=minutesLeft/(60*24);
				System.out.println(minutes+"minutes is approximately " +years +"days and "+days+"days");
	}
}
