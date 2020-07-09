
import java.util.Scanner;
public class Q2_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillisecond = System.currentTimeMillis();
		long totalSecond=totalMillisecond/1000;
		long currentSecond=totalSecond%60;
		long totalMinutes=totalSecond/60;
		long currentMinutes=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentlHours=totalHours%24;

		Scanner	input = new Scanner(System.in);
		System.out.println("Enter the time zoon offset to GMT");

		int offset = input.nextInt();
		
		System.out.println("Current Greenwich Mean time is "+currentlHours +":"+currentMinutes+":"+currentSecond);
		System.out.println("The current time is "+(currentlHours+offset)+":"+currentMinutes+":"+currentSecond);

	}

}
