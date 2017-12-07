import java.util.Scanner;
public class temp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float tempin = scan.nextFloat();
		float tempf = tempin;
		float tempc = (tempf - 32) *5 /9;
		System.out.println(tempc);
		scan.close();
	}
}
