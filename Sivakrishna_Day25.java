import java.util.Scanner;
public class Sivakrishna_Day25 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Radius : ");
	float rad = sc.nextFloat();
	double Area = 3.14*Math.pow(rad,2);
	System.out.println("Area = "+Area);
	sc.close();
	}
}
