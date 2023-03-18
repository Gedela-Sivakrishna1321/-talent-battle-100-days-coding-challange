import java.util.Scanner;
public class Sivakrishna_Day9 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int count=0;
    int temp = num;
	if (num < 0) {
        temp = Math.abs(temp); 
    }
    while(temp > 0) {
        count++;
        temp/=10;
    }
	System.out.println("The number of digits in "+num+"  = "+count);
    sc.close();
	}
}
