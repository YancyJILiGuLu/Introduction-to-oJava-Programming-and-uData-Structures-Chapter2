
import java.util.Scanner;

public class Q2_2 {
	
	public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);	
	System.out.println("Enter the radius and length of a cylinder:");
		double radius = input.nextDouble();	
		double length = input.nextDouble();	
		double pi=3.1415;
		double area =( Math.pow(radius, 2) )*pi;
		double volume=area *length;
		System.out.println("The area is :"+area);
		System.out.println("The volume is :"+volume);
	}
}


