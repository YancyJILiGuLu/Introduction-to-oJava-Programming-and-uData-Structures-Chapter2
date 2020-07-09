import java.text.DecimalFormat;
public class Q2_18 {

	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("0.00");//control output format
		final Object[][] table = new String[6][];
		table[0] = new String[] { "a", "b", "pow(a,b)" };
		table[1] = new String[] { "1", "2", "1" };
		table[2] = new String[] { "2", "3", "8" };
		table[3] = new String[] { "3", "4", "81" };
		table[4] = new String[] { "4", "5", "1024" };
		table[5] = new String[] { "5", "6", "15625" };

		for (final Object[] row : table) {
			System.out.format("%15s%15s%15s\n", row);
		}
	}
}
