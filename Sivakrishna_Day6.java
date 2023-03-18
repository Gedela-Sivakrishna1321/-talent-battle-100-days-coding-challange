import java.util.Scanner;
public class Sivakrishna_Day6 {
    // Quadrant in which the point lies
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the values of x and y coordinates :");
	int x = sc.nextInt();
	int y = sc.nextInt();
	if(x == 0 || y == 0 ) {
	System.out.println("Lies on origin ");
	} else if ( x > 0 ) {
		if (y > 0 ) {
			System.out.println(" Lies in 1st Quadrant ");
		} else {
			System.out.println(" Lies in 4th Quadrant ");
		}
	} else {
		if (y > 0 ) {
			System.out.println(" Lies in 2nd Quadrant ");
		} else {
			System.out.println(" Lies in 3rd Quadrant ");
		}
	}
    sc.close();
	}
}