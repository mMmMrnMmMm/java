import java.util.Scanner;
import java.util.Random;
public class Formative2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int randint = r.nextInt(11)+10;
		System.out.print(randint+"\nWhat is your age?\n");
		int age = sc.nextInt();
		String agestring = "";
		for (int i=0; i < randint; i++) {
			agestring = agestring+"\n"+age;
		}
		String offFactor = "";
		if (randint - age > 0) {
			offFactor = "Less";
		}
		if (randint - age == 0) {
			offFactor = "nailed it";
		}
		else
		{
			if (randint - age > 5 && randint - age < 0) {
				offFactor = "close";
			}
			else {
				offFactor = "way off";
			}
		}
		System.out.printf(agestring+"\n"+ offFactor+"\n1/35 of a gallon is %.2f liters\n1/37 of a gallon is %.2f liters", 3.785/35, 3.785/37);
		sc.close();
	}

}
