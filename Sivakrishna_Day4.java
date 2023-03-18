import java.util.Scanner;
 // Program to check whether a number is positive or Negative
class Sivakrishna_Day4 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<=3;i++) 
	{System.out.print("Enter a number : ");
	int num = sc.nextInt();
	String result;
	if (num !=0 ) {
	 	result = (num>0) ? "Positive" : "Negaitve";
	} else {
		result = "Neither Positive nor Negative ";
	}
	System.out.println(result);}
	sc.close();
	}
}