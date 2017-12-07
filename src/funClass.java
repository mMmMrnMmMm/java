import java.util.Scanner;
import java.util.Random;
public class funClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int compchoice = rd.nextInt(2);
		if (sc.nextLine().equals("r")) {
			if (compchoice == 1) {
				//computer wins
			}
			if(compchoice == 0){
				//tie
			}
			else {
				//player wins
			}}
		if (sc.nextLine().equals("p")) {
			if (compchoice == 1) {
				//tie
			}
			if(compchoice == 0){
				//player wins
			}
			else {
				//comp wins
			}
		}
		if (sc.nextLine().equals("s")) {
			if (compchoice == 1) {
				//player wins
			}
			if(compchoice == 0){
				//comp wins
			}
			else {
				//tie
			}
		}
	}
}
