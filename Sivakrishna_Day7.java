import java.util.Scanner;
public class Sivakrishna_Day7 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the year & month : ");
	int year = sc.nextInt();
	int month = sc.nextInt();
	if (month != 2 ) { 
		if ( month < 8 ) 
			System.out.println((month%2 == 0) ? 30 : 31); 
		else 
			System.out.println((month%2== 0 ) ? 31 : 30);
	} else {
	// Leap year condition
		if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0) ) 
			System.out.println("29");
		else 
			System.out.println("28");
		
	}
    sc.close();
	}
}
			