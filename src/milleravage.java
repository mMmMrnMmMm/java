import java.util.Scanner;
public class milleravage {
	public static void main(String[] args) {
		System.out.println("how many ages do you want to enter?");
		Scanner sc = new Scanner(System.in);
		float[] ages = new float[sc.nextInt()];
		for (int i = 0; i < ages.length; i++) {
			ages[i] = sc.nextFloat();
		}
		System.out.println("finished entering ages!");
		sc.close();
		float sumOfAges = 0;
		for (int i = 0; i < ages.length; i++) {
			sumOfAges = sumOfAges + ages[i];
		}
		System.out.println(sumOfAges / ages.length);
	}
}
