import java.util.Scanner;
public class SlopeFormulaMiller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what are the x & y values of the first point?");
		float initX = sc.nextFloat();
		float initY = sc.nextFloat();
		System.out.println("what are the x & y values of the second point?");
		sc.close();
		float finX = sc.nextFloat();
		float finY = sc.nextFloat();
		float xLen = finX - initX;
		float yLen = finY - initY;
		xLen = xLen * xLen;
		yLen = yLen * yLen;
		float tLen = xLen+yLen;
		System.out.println("the distance between the points is appoximately "+ Math.sqrt(tLen));
		sc.close();
	}
}
